package com.kakovets.beatbox

private const val WAV = ".wav"

class Sound(val assetPath: String, var soundID: Int? = null) {
    val name = assetPath.split("/").last().removeSuffix(WAV)
}