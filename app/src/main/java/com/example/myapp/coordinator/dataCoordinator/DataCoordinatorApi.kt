//package com.example.myapp.coordinator.dataCoordinator
//
//
//
//import android.util.Log
//import com.android.volley.Request
//import com.android.volley.RequestQueue
//import com.android.volley.toolbox.HttpHeaderParser
////import com.example.myapp.dataCoordinator.DataCoordinator.Companion.identifier
//import com.example.myapp.model.api.Error
//import com.example.myapp.model.api.Response
////import com.example.myapp.model.constants.DebuggingIdentifiers
//import com.example.myapp.data.GsonRequest
//import com.google.gson.Gson
//import com.google.gson.JsonSyntaxException
//import org.json.JSONObject
//import java.io.UnsupportedEncodingException
//import java.nio.charset.Charset
//
//val apiRequestQueue: RequestQueue? = null
//
//this.apiRequestQueue = Va
//
//
//fun <DataCoordinatorApi> DataCoordinatorApi.sampleAPI(
//    email: String,
//    onSuccess: () -> Unit,
//    onError: () -> Unit
//) {
//    val apiRequestQueue = this.apiRequestQueue ?: return
//    /// Create the payload
//    val payload = JSONObject()
//    payload.put("email", email)
//    /// Create the Headers
//    var headers: MutableMap<String, String> = HashMap<String, String>()
//    headers.put("a-header-key", "a-sample-key")
//    // Create the Request
//    val request = GsonRequest(
//        url = "http://localhost:3001/product",
//        clazz = Response::class.java,
//        method = Request.Method.GET,
//        headers = headers,
//        jsonPayload = payload,
//        listener = {
//            Log.i(
//                "identifier",
//                "request : $it.",
//            )
//            onSuccess()
//        },
//        errorListener = {
//            val response = it.networkResponse
//            try {
//                val errorJson = String(
//                    response.data,
//                    Charset.forName(HttpHeaderParser.parseCharset(response.headers))
//                )
//                val errorObj =" Gson().fromJson(errorJson, SampleError::class.java)"
//                Log.i(
//                    "identifier",
//                    " request : ${errorObj}",
//                )
//                onError()
//            } catch (e: UnsupportedEncodingException) {
//                e.printStackTrace()
//            } catch (e: JsonSyntaxException) {
//                e.printStackTrace()
//            }
//        })
//    // Make the request
//    apiRequestQueue.add(request)
//}
//
