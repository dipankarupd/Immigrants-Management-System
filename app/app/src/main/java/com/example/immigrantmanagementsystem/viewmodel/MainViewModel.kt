//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.mutableStateOf
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.immigrantmanagementsystem.data.model.ImmigrantInfoRequest
//import com.example.immigrantmanagementsystem.data.model.ImmigrantInfoResponse
//import com.example.immigrantmanagementsystem.repository.Repository
//import kotlinx.coroutines.launch
//import retrofit2.Response
//
//class MainViewModel(private val repository: Repository) : ViewModel() {
//
//    private val _myResponse = mutableStateOf<Response<ImmigrantInfoResponse>?>(null)
//    val myResponse: MutableState<Response<ImmigrantInfoResponse>?> = _myResponse
//
//    fun pushImmigrant(immigrantInfoRequest: ImmigrantInfoRequest) {
//        viewModelScope.launch {
//            val response: Response<ImmigrantInfoResponse> = repository.pushImmigrant(immigrantInfoRequest)
//            _myResponse.value = response
//        }
//    }
//}
