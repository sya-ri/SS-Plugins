@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package com.github.syari.ss.plugins.core.config.type.data

import com.github.syari.ss.plugins.core.config.CustomConfig
import com.github.syari.ss.plugins.core.config.CustomFileConfig
import com.github.syari.ss.plugins.core.config.type.ConfigDataType

object ConfigFloatDataType : ConfigDataType.WithSet<Float> {
    override val typeName = "Float"

    override fun get(
        config: CustomConfig,
        path: String,
        notFoundError: Boolean
    ): Float? {
        return config.get(path, ConfigDataType.NUMBER, notFoundError)?.toFloat()
    }

    override fun set(config: CustomFileConfig, path: String, value: Float?) {
        config.setUnsafe(path, value)
    }
}
