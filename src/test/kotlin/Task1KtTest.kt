import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task1KtTest {

    @Test
    fun shpuld_return_Result_doubleValue_when_MylistHaveoneChar() {
        //given list and the char that we want to disply percentage of  repetitions.
        val MyList= mutableListOf<String>("a","b","b")
        var GivenChar="a"
        //when find GivenChar in Mylist
        val Result=SomeItem(MyList,GivenChar)
        //then check the Result between  expeted and actualy
        assertEquals(33.0,Result)
    }
    @Test
    fun shpuld_return_MenusOne_when_ListIsEmbty() {
        //given list and the char that we want to disply percentage of  repetitions.
        val MyList= mutableListOf<String>()
        var GivenChar="a"
        //when find GivenChar in Mylist
        val Result=SomeItem(MyList,GivenChar)
        //then check the Result between  expeted and actualy
        assertEquals(-1.0,Result)
    }
    @Test
    fun shpuld_return_MenusOne_when_elemintInListHaveMoreOneCharectuer() {
        //given list and the char that we want to disply percentage of  repetitions.
        val MyList= mutableListOf<String>("a","bb","b")
        var GivenChar="a"
        //when find GivenChar in Mylist
        val Result=SomeItem(MyList,GivenChar)
        //then check the Result between  expeted and actualy
        assertEquals(-1.0,Result)
    }
    @Test
    fun shpuld_return_MenusOne_when_elemintInList_IsBlank() {
        //given list and the char that we want to disply percentage of  repetitions.
        val MyList= mutableListOf<String>(" ","b","b")
        var GivenChar="a"
        //when find GivenChar in Mylist
        val Result=SomeItem(MyList,GivenChar)
        //then check the Result between  expeted and actualy
        assertEquals(-1.0,Result)
    }
    @Test
    fun shpuld_return_MenusOne_when_GivenEelemint_IsNotLikeInlist() {
        //given list and the char that we want to disply percentage of  repetitions.
        val MyList= mutableListOf<String>("a","b","b")
        var GivenChar="1"
        //when find GivenChar in Mylist
        val Result=SomeItem(MyList,GivenChar)
        //then check the Result between  expeted and actualy
        assertEquals(-1.0,Result)
    }
}