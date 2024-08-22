package com.fleeksoft.ksoup.network

import io.ktor.client.engine.*
import io.ktor.client.engine.okhttp.OkHttp

actual fun provideHttpClientEngine(): HttpClientEngine {
    return OkHttp.create()
}