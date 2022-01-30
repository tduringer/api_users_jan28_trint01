package com.example.api_users_jan28_trint01.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.api_users_jan28_trint01.databinding.FragmentUserBinding
import com.example.api_users_jan28_trint01.model.network.ApiManager
import com.example.api_users_jan28_trint01.model.network.models.UserModel
import com.example.api_users_jan28_trint01.model.repository.UserRepository
import com.example.api_users_jan28_trint01.viewmodel.UserViewModel
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi

class UserFragment : Fragment() {

    private var _binding : FragmentUserBinding? = null
    private val binding : FragmentUserBinding get() = _binding!!

    private val viewModel: UserViewModel by activityViewModels {
        UserViewModel.Factory(UserRepository(ApiManager()))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserBinding.inflate(inflater,container,false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.users.observe(viewLifecycleOwner) {
            Log.d(TAG,"Inside UserFragment: onViewCreated : observe block: it is ${it.toString()}")
            Log.d(TAG,"Inside UserFragment: onViewCreated : observe block: it is $it")

//            val json: String = it.toString()
//
//            val moshi: Moshi = Moshi.Builder().build()
//            val jsonAdapter: JsonAdapter<UserModel> = moshi.adapter<UserModel>()
//
//            val userObject = jsonAdapter.fromJson(json)
//            Log.d(TAG, "userObject is $userObject" )

            binding.tvUser.text = it.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}