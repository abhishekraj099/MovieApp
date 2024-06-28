package viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp.models.Data
import com.example.movieapp.viewModel.Repository

import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {
    private val repository = Repository()
    var state = mutableStateOf(ScreenState())

    init {
        viewModelScope.launch {
            val response = repository.getMovieList(state.value.page)
            state.value = state.value.copy(movies = response.body()!!.data)
        }
    }

}


data class ScreenState(
    val movies: List<Data> = emptyList(),
    val page: Int = 1,
)