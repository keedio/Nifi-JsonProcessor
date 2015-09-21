package org.keedio.nifi.processor

import org.apache.nifi.annotation.documentation.{CapabilityDescription, Tags}
import org.apache.nifi.components.PropertyDescriptor
import org.apache.nifi.processor._
import org.apache.nifi.processor.util.StandardValidators

import scala.collection.mutable.{ListBuffer, Set}


/**
 * Created by luislazaro on 21/9/15.
 * lalazaro@keedio.com
 * Keedio
 */

@Tags("Json", "JsonProcessor")
@CapabilityDescription("Fetch value from json path")
class JsonProcessor extends AbstractProcessor{

    private val properties: ListBuffer[PropertyDescriptor] = ListBuffer()
    private val relationships: Set[Relationship] = Set()



    override def init(context: ProcessorInitializationContext): Unit = ???
    override def onTrigger(context: ProcessContext, session: ProcessSession): Unit = ???
    override def getRelationships(): Set[Relationship] = ???
    override def getSupportedPropertyDescriptors(): List[PropertyDescriptor] = ???
}

object JsonProcessor {
    final val MATCH_ATTR: String = "match"
    final val JSON_PATH: PropertyDescriptor = new org.apache.nifi.components.PropertyDescriptor.Builder.type
        .name("Json Path")
        .required(true)
        .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
        .build()

    final val SUCCESS: Relationship = new org.apache.nifi.processor.Relationship.Builder.type
        .name("SUCCESS")
        .description("Success relationship")
        .build()

}
