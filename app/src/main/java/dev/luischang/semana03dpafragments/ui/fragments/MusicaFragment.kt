package dev.luischang.semana03dpafragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.luischang.semana03dpafragments.R
import dev.luischang.semana03dpafragments.adapter.SongAdapter
import dev.luischang.semana03dpafragments.model.Song


class MusicaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica:RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(listSong())

        return view
    }

    private fun listSong(): List<Song>{
        var lstSong: ArrayList<Song> = ArrayList()
        lstSong.add(Song(1,R.drawable.intheend,"In the end", "Hybrid Theory","10,000","3:36"))
        lstSong.add(Song(2,R.drawable.numb,"Numb", "Meteora","9,500","3:05"))
        lstSong.add(Song(3,R.drawable.whativedone,"What I've done", "Hybrid Theory","8,200","3:23"))
        lstSong.add(Song(4,R.drawable.onestepcloser,"One step closer", "Hybrid Theory","7,320","3:10"))
        lstSong.add(Song(5,R.drawable.castleofglass,"Castle Of Glass", "Living Things","11,000","4:16"))

        return lstSong
    }

}