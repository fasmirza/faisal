package com.example.demoaplication.network.model.response

import com.google.gson.annotations.SerializedName

data class GifResponse(
    @SerializedName("data"       ) var data       : ArrayList<Data> = arrayListOf(),
    @SerializedName("meta"       ) var meta       : Meta?           = Meta(),
    @SerializedName("pagination" ) var pagination : Pagination?     = Pagination()

)

data class Original (

    @SerializedName("height"    ) var height   : String? = null,
    @SerializedName("width"     ) var width    : String? = null,
    @SerializedName("size"      ) var size     : String? = null,
    @SerializedName("url"       ) var url      : String? = null,
    @SerializedName("mp4_size"  ) var mp4Size  : String? = null,
    @SerializedName("mp4"       ) var mp4      : String? = null,
    @SerializedName("webp_size" ) var webpSize : String? = null,
    @SerializedName("webp"      ) var webp     : String? = null,
    @SerializedName("frames"    ) var frames   : String? = null,
    @SerializedName("hash"      ) var hash     : String? = null

)

data class Downsized (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class DownsizedLarge (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class DownsizedMedium (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class DownsizedSmall (

    @SerializedName("height"   ) var height  : String? = null,
    @SerializedName("width"    ) var width   : String? = null,
    @SerializedName("mp4_size" ) var mp4Size : String? = null,
    @SerializedName("mp4"      ) var mp4     : String? = null

)

data class DownsizedStill (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class FixedHeight (

    @SerializedName("height"    ) var height   : String? = null,
    @SerializedName("width"     ) var width    : String? = null,
    @SerializedName("size"      ) var size     : String? = null,
    @SerializedName("url"       ) var url      : String? = null,
    @SerializedName("mp4_size"  ) var mp4Size  : String? = null,
    @SerializedName("mp4"       ) var mp4      : String? = null,
    @SerializedName("webp_size" ) var webpSize : String? = null,
    @SerializedName("webp"      ) var webp     : String? = null

)

data class FixedHeightDownsampled (

    @SerializedName("height"    ) var height   : String? = null,
    @SerializedName("width"     ) var width    : String? = null,
    @SerializedName("size"      ) var size     : String? = null,
    @SerializedName("url"       ) var url      : String? = null,
    @SerializedName("webp_size" ) var webpSize : String? = null,
    @SerializedName("webp"      ) var webp     : String? = null

)

data class FixedHeightSmall (

    @SerializedName("height"    ) var height   : String? = null,
    @SerializedName("width"     ) var width    : String? = null,
    @SerializedName("size"      ) var size     : String? = null,
    @SerializedName("url"       ) var url      : String? = null,
    @SerializedName("mp4_size"  ) var mp4Size  : String? = null,
    @SerializedName("mp4"       ) var mp4      : String? = null,
    @SerializedName("webp_size" ) var webpSize : String? = null,
    @SerializedName("webp"      ) var webp     : String? = null

)
data class FixedHeightSmallStill (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class FixedHeightStill (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class FixedWidth (

    @SerializedName("height"    ) var height   : String? = null,
    @SerializedName("width"     ) var width    : String? = null,
    @SerializedName("size"      ) var size     : String? = null,
    @SerializedName("url"       ) var url      : String? = null,
    @SerializedName("mp4_size"  ) var mp4Size  : String? = null,
    @SerializedName("mp4"       ) var mp4      : String? = null,
    @SerializedName("webp_size" ) var webpSize : String? = null,
    @SerializedName("webp"      ) var webp     : String? = null
)


data class FixedWidthDownsampled(

    @SerializedName("height") var height: String? = null,
    @SerializedName("width") var width: String? = null,
    @SerializedName("size") var size: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("webp_size") var webpSize: String? = null,
    @SerializedName("webp") var webp: String? = null

)

data class FixedWidthSmall (

    @SerializedName("height"    ) var height   : String? = null,
    @SerializedName("width"     ) var width    : String? = null,
    @SerializedName("size"      ) var size     : String? = null,
    @SerializedName("url"       ) var url      : String? = null,
    @SerializedName("mp4_size"  ) var mp4Size  : String? = null,
    @SerializedName("mp4"       ) var mp4      : String? = null,
    @SerializedName("webp_size" ) var webpSize : String? = null,
    @SerializedName("webp"      ) var webp     : String? = null

)

data class FixedWidthSmallStill (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class FixedWidthStill (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class Looping (

    @SerializedName("mp4_size" ) var mp4Size : String? = null,
    @SerializedName("mp4"      ) var mp4     : String? = null

)

data class OriginalStill (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class OriginalMp4 (

    @SerializedName("height"   ) var height  : String? = null,
    @SerializedName("width"    ) var width   : String? = null,
    @SerializedName("mp4_size" ) var mp4Size : String? = null,
    @SerializedName("mp4"      ) var mp4     : String? = null

)

data class Preview (

    @SerializedName("height"   ) var height  : String? = null,
    @SerializedName("width"    ) var width   : String? = null,
    @SerializedName("mp4_size" ) var mp4Size : String? = null,
    @SerializedName("mp4"      ) var mp4     : String? = null

)

data class PreviewGif (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)
data class PreviewWebp (

    @SerializedName("height" ) var height : String? = null,
    @SerializedName("width"  ) var width  : String? = null,
    @SerializedName("size"   ) var size   : String? = null,
    @SerializedName("url"    ) var url    : String? = null

)

data class Hd (

    @SerializedName("height"   ) var height  : String? = null,
    @SerializedName("width"    ) var width   : String? = null,
    @SerializedName("mp4_size" ) var mp4Size : String? = null,
    @SerializedName("mp4"      ) var mp4     : String? = null

)

data class FourEightywStill (

@SerializedName("height" ) var height : String? = null,
@SerializedName("width"  ) var width  : String? = null,
@SerializedName("size"   ) var size   : String? = null,
@SerializedName("url"    ) var url    : String? = null

)

data class Images (

    @SerializedName("original"                 ) var original               : Original?               = Original(),
    @SerializedName("downsized"                ) var downsized              : Downsized?              = Downsized(),
    @SerializedName("downsized_large"          ) var downsizedLarge         : DownsizedLarge?         = DownsizedLarge(),
    @SerializedName("downsized_medium"         ) var downsizedMedium        : DownsizedMedium?        = DownsizedMedium(),
    @SerializedName("downsized_small"          ) var downsizedSmall         : DownsizedSmall?         = DownsizedSmall(),
    @SerializedName("downsized_still"          ) var downsizedStill         : DownsizedStill?         = DownsizedStill(),
    @SerializedName("fixed_height"             ) var fixedHeight            : FixedHeight?            = FixedHeight(),
    @SerializedName("fixed_height_downsampled" ) var fixedHeightDownsampled : FixedHeightDownsampled? = FixedHeightDownsampled(),
    @SerializedName("fixed_height_small"       ) var fixedHeightSmall       : FixedHeightSmall?       = FixedHeightSmall(),
    @SerializedName("fixed_height_small_still" ) var fixedHeightSmallStill  : FixedHeightSmallStill?  = FixedHeightSmallStill(),
    @SerializedName("fixed_height_still"       ) var fixedHeightStill       : FixedHeightStill?       = FixedHeightStill(),
    @SerializedName("fixed_width"              ) var fixedWidth             : FixedWidth?             = FixedWidth(),
    @SerializedName("fixed_width_downsampled"  ) var fixedWidthDownsampled  : FixedWidthDownsampled?  = FixedWidthDownsampled(),
    @SerializedName("fixed_width_small"        ) var fixedWidthSmall        : FixedWidthSmall?        = FixedWidthSmall(),
    @SerializedName("fixed_width_small_still"  ) var fixedWidthSmallStill   : FixedWidthSmallStill?   = FixedWidthSmallStill(),
    @SerializedName("fixed_width_still"        ) var fixedWidthStill        : FixedWidthStill?        = FixedWidthStill(),
    @SerializedName("looping"                  ) var looping                : Looping?                = Looping(),
    @SerializedName("original_still"           ) var originalStill          : OriginalStill?          = OriginalStill(),
    @SerializedName("original_mp4"             ) var originalMp4            : OriginalMp4?            = OriginalMp4(),
    @SerializedName("preview"                  ) var preview                : Preview?                = Preview(),
    @SerializedName("preview_gif"              ) var previewGif             : PreviewGif?             = PreviewGif(),
    @SerializedName("preview_webp"             ) var previewWebp            : PreviewWebp?            = PreviewWebp(),
    @SerializedName("hd"                       ) var hd                     : Hd?                     = Hd(),
    @SerializedName("480w_still"               ) var fourEightywStill       : FourEightywStill?              = FourEightywStill()

)

data class User (

    @SerializedName("avatar_url"    ) var avatarUrl    : String?  = null,
    @SerializedName("banner_image"  ) var bannerImage  : String?  = null,
    @SerializedName("banner_url"    ) var bannerUrl    : String?  = null,
    @SerializedName("profile_url"   ) var profileUrl   : String?  = null,
    @SerializedName("username"      ) var username     : String?  = null,
    @SerializedName("display_name"  ) var displayName  : String?  = null,
    @SerializedName("description"   ) var description  : String?  = null,
    @SerializedName("instagram_url" ) var instagramUrl : String?  = null,
    @SerializedName("website_url"   ) var websiteUrl   : String?  = null,
    @SerializedName("is_verified"   ) var isVerified   : Boolean? = null

)
data class Onload (

    @SerializedName("url" ) var url : String? = null

)

data class Onclick (

    @SerializedName("url" ) var url : String? = null

)

data class Onsent (

    @SerializedName("url" ) var url : String? = null

)

data class Analytics (

    @SerializedName("onload"  ) var onload  : Onload?  = Onload(),
    @SerializedName("onclick" ) var onclick : Onclick? = Onclick(),
    @SerializedName("onsent"  ) var onsent  : Onsent?  = Onsent()

)
data class Data (

    @SerializedName("type"                       ) var type                     : String?    = null,
    @SerializedName("id"                         ) var id                       : String?    = null,
    @SerializedName("url"                        ) var url                      : String?    = null,
    @SerializedName("slug"                       ) var slug                     : String?    = null,
    @SerializedName("bitly_gif_url"              ) var bitlyGifUrl              : String?    = null,
    @SerializedName("bitly_url"                  ) var bitlyUrl                 : String?    = null,
    @SerializedName("embed_url"                  ) var embedUrl                 : String?    = null,
    @SerializedName("username"                   ) var username                 : String?    = null,
    @SerializedName("source"                     ) var source                   : String?    = null,
    @SerializedName("title"                      ) var title                    : String?    = null,
    @SerializedName("rating"                     ) var rating                   : String?    = null,
    @SerializedName("content_url"                ) var contentUrl               : String?    = null,
    @SerializedName("source_tld"                 ) var sourceTld                : String?    = null,
    @SerializedName("source_post_url"            ) var sourcePostUrl            : String?    = null,
    @SerializedName("is_sticker"                 ) var isSticker                : Int?       = null,
    @SerializedName("import_datetime"            ) var importDatetime           : String?    = null,
    @SerializedName("trending_datetime"          ) var trendingDatetime         : String?    = null,
    @SerializedName("images"                     ) var images                   : Images?    = Images(),
    @SerializedName("user"                       ) var user                     : User?      = User(),
    @SerializedName("analytics_response_payload" ) var analyticsResponsePayload : String?    = null,
    @SerializedName("analytics"                  ) var analytics                : Analytics? = Analytics(),
    @SerializedName("alt_text"                   ) var altText                  : String?    = null

)

data class Meta (

    @SerializedName("status"      ) var status     : Int?    = null,
    @SerializedName("msg"         ) var msg        : String? = null,
    @SerializedName("response_id" ) var responseId : String? = null

)

data class Pagination (

    @SerializedName("total_count" ) var totalCount : Int? = null,
    @SerializedName("count"       ) var count      : Int? = null,
    @SerializedName("offset"      ) var offset     : Int? = null

)


