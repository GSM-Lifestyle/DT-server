package lifestyle.dt.infrastructure.feign.dto.request

data class GoogleCodeRequest(
    val code: String,
    val clientId: String,
    val clientSecret: String,
    val redirectUri: String,
    val grantType: String = "authorization_code"
)