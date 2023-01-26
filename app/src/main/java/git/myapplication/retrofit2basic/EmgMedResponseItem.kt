package git.myapplication.retrofit2basic


import com.squareup.moshi.Json


//@field:Json DTO
data class EmgMedResponseItem(
    @field:Json(name = "HOLDY_OPR_CONT")
    val hOLDYOPRCONT: String?,
    @field:Json(name = "INST_NM")
    val iNSTNM: String?,
    @field:Json(name = "INST_TELNO")
    val iNSTTELNO: String?,
    @field:Json(name = "JURISD_NM")
    val jURISDNM: String?,
    @field:Json(name = "OPR_CONT")
    val oPRCONT: String?,
    @field:Json(name = "REFINE_LOTNO_ADDR")
    val rEFINELOTNOADDR: String?,
    @field:Json(name = "REFINE_ROADNM_ADDR")
    val rEFINEROADNMADDR: String?,
    @field:Json(name = "REFINE_WGS84_LAT")
    val rEFINEWGS84LAT: String?,
    @field:Json(name = "REFINE_WGS84_LOGT")
    val rEFINEWGS84LOGT: String?,
    @field:Json(name = "REFINE_ZIPNO")
    val rEFINEZIPNO: String?,
    @field:Json(name = "RM")
    val rM: String?,
    @field:Json(name = "SAT_OPR_CONT")
    val sATOPRCONT: String?,
    @field:Json(name = "SIGUN_NM")
    val sIGUNNM: String?,
    @field:Json(name = "TELNO")
    val tELNO: String?
)