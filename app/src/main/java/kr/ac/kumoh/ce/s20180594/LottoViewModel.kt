package kr.ac.kumoh.ce.s20180594

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random
class LottoViewModel : ViewModel() {
    private var _numbers = IntArray(6){0}
    val numbers
        get()=_numbers
    fun generate(){
        var num = 0
        for(i in _numbers.indices){
            // 중복 검사
            do{
                num = Random.nextInt(1,46)
            } while (_numbers.contains(num))
            _numbers[i]=num

            Log.i("Number!!",_numbers[i].toString())
        }

        // 정렬
        _numbers.sort()
    }
}