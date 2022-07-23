package com.example.marvelapp.presentation.characters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.core.domain.model.Character
import com.example.marvelapp.R
import com.example.marvelapp.databinding.FragmentCharacteresBinding

class CharactersFragment : Fragment() {

    lateinit var binding: FragmentCharacteresBinding
    private val  adapterChar= CharactersAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentCharacteresBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCharactersAdapter()
        adapterChar.submitList(
            listOf(
                Character("Spider",
                    "https://images.freeimages.com/images/large-previews/b23/d-link-switch-1243624.jpg"),
                Character("Spider",
                    "https://images.freeimages.com/images/large-previews/b23/d-link-switch-1243624.jpg"),
                Character("Spider",
                    "https://images.freeimages.com/images/large-previews/b23/d-link-switch-1243624.jpg"),
                Character("Spider",
                    "https://images.freeimages.com/images/large-previews/b23/d-link-switch-1243624.jpg"),
                Character("Spider",
                    "https://images.freeimages.com/images/large-previews/b23/d-link-switch-1243624.jpg")
        ))
    }

    private fun initCharactersAdapter() {
        with(binding.recyclerCharacters){
            setHasFixedSize(true)
            adapter =  adapterChar
        }
    }
}