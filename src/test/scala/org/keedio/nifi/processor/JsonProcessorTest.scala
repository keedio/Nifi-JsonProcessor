package org.keedio.nifi.processor



/**
 * Created by luislazaro on 21/9/15.
 * lalazaro@keedio.com
 * Keedio
 */
class JsonProcessorTest {

//    @Test
//    def testOnTrigger(): Unit  = {
//        val content: InputStream = new ByteArrayInputStream("{\"hola\":\"keedio mola\"}".getBytes())
//        val a = new JsonProcessor
//        val runner: TestRunner = TestRunners.newTestRunner(a)
//        runner.setProperty(JsonProcessor.JSON_PATH, "$.hola")
//        runner.enqueue(content)
//        runner.run(1)
//        runner.assertQueueEmpty()
//
//        val results0: mutable.Buffer[MockFlowFile] = runner.getFlowFilesForRelationship(JsonProcessor.SUCCESS).asScala
//        val results: List[MockFlowFile] = results0.toList
//        assertTrue("1 match", results.size == 1)
//        val result: MockFlowFile = results(0)
//        val resultValue = new String(runner.getContentAsByteArray(result))
//        println("Match: " + IOUtils.toString(runner.getContentAsByteArray(result)))
//
//        result.assertAttributeEquals(JsonProcessor.MATCH_ATTR, "Keedio mola")
//        result.assertContentEquals("Keedio mola")
//    }
}
