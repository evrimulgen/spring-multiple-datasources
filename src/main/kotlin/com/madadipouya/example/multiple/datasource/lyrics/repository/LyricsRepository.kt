package com.madadipouya.example.multiple.datasource.lyrics.repository

import com.madadipouya.example.multiple.datasource.lyrics.entity.Lyrics
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LyricsRepository : JpaRepository<Lyrics, Int>