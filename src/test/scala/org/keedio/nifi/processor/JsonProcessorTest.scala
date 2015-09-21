package org.keedio.nifi.processor

import java.io.{ByteArrayInputStream, InputStream}

import org.apache.commons.io.IOUtils
import org.apache.nifi.util.{MockFlowFile, TestRunner, TestRunners}
import org.junit.Test
import org.junit.Assert.assertTrue
import scala.collection.JavaConverters._
import scala.collection.mutable



/**
 * Created by luislazaro on 21/9/15.
 * lalazaro@keedio.com
 * Keedio
 */
class JsonProcessorTest {

    @Test
    def testOnTrigger(): Unit  = {
        val content: InputStream = new ByteArrayInputStream("{\"hola\":\"Keedio mola\"}".getBytes())
        val runner: TestRunner = TestRunners.newTestRunner(new JsonProcessor)
        runner.setProperty(JsonProcessor.JSON_PATH, "$.hello")
        runner.enqueue(content)
        runner.run(1)
        runner.assertQueueEmpty()

        val results0: mutable.Buffer[MockFlowFile] = runner.getFlowFilesForRelationship(JsonProcessor.SUCCESS).asScala
        val results: List[MockFlowFile] = results0.toList
        assertTrue("1 match", results.size == 1)
        val result: MockFlowFile = results(0)
        val resultValue = new String(runner.getContentAsByteArray(result))
        println("Match: " + IOUtils.toString(runner.getContentAsByteArray(result)))

        result.assertAttributeEquals(JsonProcessor.MATCH_ATTR, "Keedio mola")
        result.assertContentEquals("Keedio mola")
    }
}
