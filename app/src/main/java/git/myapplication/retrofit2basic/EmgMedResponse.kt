package git.myapplication.retrofit2basic


import com.squareup.moshi.Json


data class EmgMedResponse(
    @field:Json(name = "TBGGSCREECLSTM")
    val TBGGSCREECLSTM: List<TBGGSCREECLSTM>?
)

data class TBGGSCREECLSTM(
    val head: List<Head>?,
    val row: List<Row>?
)

data class Head(
    @field:Json(name = "api_version")
    val apiVersion: String?, // 1.0
    @field:Json(name = "list_total_count")
    val listTotalCount: Int?, // 172
    @field:Json(name = "RESULT")
    val rESULT: RESULT?
)

data class RESULT(
    @field:Json(name = "CODE")
    val cODE: String?, // INFO-000
    @field:Json(name = "MESSAGE")
    val mESSAGE: String? // 정상 처리되었습니다.
)

//@field:Json DTO
data class Row(
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