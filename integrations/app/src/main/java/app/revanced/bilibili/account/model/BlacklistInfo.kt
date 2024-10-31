package app.revanced.bilibili.account.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import app.revanced.bilibili.model.serializer.SecondsAsDate
import java.util.Date

@Serializable
class BlacklistInfo(
    @SerialName("uid")
    val uid: Long = 0,
    @SerialName("is_blacklist")
    var isBlacklist: Boolean = false,
    @SerialName("is_whitelist")
    var isWhitelist: Boolean = false,
    @SerialName("status")
    var status: Int = 0,
    @SerialName("ban_until")
    var banUntil: SecondsAsDate? = null
) {
    init {
        isBlacklist = false
        isWhitelist = false
        status = 0
        banUntil = null
    }
}
