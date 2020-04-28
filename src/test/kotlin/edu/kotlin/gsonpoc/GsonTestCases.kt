package edu.kotlin.gsonpoc

import com.google.gson.Gson
import edu.kotlin.gsonpoc.domain.Foo
import junit.framework.Assert.assertEquals
import org.junit.Test

class GsonTestCases{

    @Test
    internal fun whenDeserializingToSimpleObject_thenCorrect() {
        val stringJson = "{\"intValue\":1,\"stringValue\":\"one\"}"
        val fooObject = Gson().fromJson(stringJson,Foo::class.java)
        assertEquals(fooObject.intValue,1)
        assertEquals(fooObject.stringValue,"one")
    }
}