package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Character encoding of the SRT file
 */
public enum CaptionCharacterEncoding {
  
  /**
   * Character encoding of the SRT file
   */
  ANSI_X3_4_1968("ANSI_X3.4-1968"),
  
  /**
   * Character encoding of the SRT file
   */
  ANSI_X3_4_1986("ANSI_X3.4-1986"),
  
  /**
   * Character encoding of the SRT file
   */
  ARABIC("ARABIC"),
  
  /**
   * Character encoding of the SRT file
   */
  ARMSCII_8("ARMSCII-8"),
  
  /**
   * Character encoding of the SRT file
   */
  ASCII("ASCII"),
  
  /**
   * Character encoding of the SRT file
   */
  ASMO_708("ASMO-708"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG_5("BIG-5"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG_FIVE("BIG-FIVE"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG5("BIG5"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG5_HKSCS("BIG5-HKSCS"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG5_HKSCS_1999("BIG5-HKSCS:1999"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG5_HKSCS_2001("BIG5-HKSCS:2001"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG5_HKSCS_2004("BIG5-HKSCS:2004"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG5_HKSCS_2008("BIG5-HKSCS:2008"),
  
  /**
   * Character encoding of the SRT file
   */
  BIG5HKSCS("BIG5HKSCS"),
  
  /**
   * Character encoding of the SRT file
   */
  BIGFIVE("BIGFIVE"),
  
  /**
   * Character encoding of the SRT file
   */
  C99("C99"),
  
  /**
   * Character encoding of the SRT file
   */
  CHAR("CHAR"),
  
  /**
   * Character encoding of the SRT file
   */
  CHINESE("CHINESE"),
  
  /**
   * Character encoding of the SRT file
   */
  CN("CN"),
  
  /**
   * Character encoding of the SRT file
   */
  CN_BIG5("CN-BIG5"),
  
  /**
   * Character encoding of the SRT file
   */
  CN_GB("CN-GB"),
  
  /**
   * Character encoding of the SRT file
   */
  CN_GB_ISOIR165("CN-GB-ISOIR165"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1131("CP1131"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1133("CP1133"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1250("CP1250"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1251("CP1251"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1252("CP1252"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1253("CP1253"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1254("CP1254"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1255("CP1255"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1256("CP1256"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1257("CP1257"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1258("CP1258"),
  
  /**
   * Character encoding of the SRT file
   */
  CP1361("CP1361"),
  
  /**
   * Character encoding of the SRT file
   */
  CP154("CP154"),
  
  /**
   * Character encoding of the SRT file
   */
  CP367("CP367"),
  
  /**
   * Character encoding of the SRT file
   */
  CP819("CP819"),
  
  /**
   * Character encoding of the SRT file
   */
  CP850("CP850"),
  
  /**
   * Character encoding of the SRT file
   */
  CP862("CP862"),
  
  /**
   * Character encoding of the SRT file
   */
  CP866("CP866"),
  
  /**
   * Character encoding of the SRT file
   */
  CP874("CP874"),
  
  /**
   * Character encoding of the SRT file
   */
  CP932("CP932"),
  
  /**
   * Character encoding of the SRT file
   */
  CP936("CP936"),
  
  /**
   * Character encoding of the SRT file
   */
  CP949("CP949"),
  
  /**
   * Character encoding of the SRT file
   */
  CP950("CP950"),
  
  /**
   * Character encoding of the SRT file
   */
  CSASCII("CSASCII"),
  
  /**
   * Character encoding of the SRT file
   */
  CSBIG5("CSBIG5"),
  
  /**
   * Character encoding of the SRT file
   */
  CSEUCKR("CSEUCKR"),
  
  /**
   * Character encoding of the SRT file
   */
  CSEUCPKDFMTJAPANESE("CSEUCPKDFMTJAPANESE"),
  
  /**
   * Character encoding of the SRT file
   */
  CSEUCTW("CSEUCTW"),
  
  /**
   * Character encoding of the SRT file
   */
  CSGB2312("CSGB2312"),
  
  /**
   * Character encoding of the SRT file
   */
  CSHALFWIDTHKATAKANA("CSHALFWIDTHKATAKANA"),
  
  /**
   * Character encoding of the SRT file
   */
  CSHPROMAN8("CSHPROMAN8"),
  
  /**
   * Character encoding of the SRT file
   */
  CSIBM866("CSIBM866"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO14JISC6220RO("CSISO14JISC6220RO"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO159JISX02121990("CSISO159JISX02121990"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO2022CN("CSISO2022CN"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO2022JP("CSISO2022JP"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO2022JP2("CSISO2022JP2"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO2022KR("CSISO2022KR"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO57GB1988("CSISO57GB1988"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO58GB231280("CSISO58GB231280"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISO87JISX0208("CSISO87JISX0208"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATIN1("CSISOLATIN1"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATIN2("CSISOLATIN2"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATIN3("CSISOLATIN3"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATIN4("CSISOLATIN4"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATIN5("CSISOLATIN5"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATIN6("CSISOLATIN6"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATINARABIC("CSISOLATINARABIC"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATINCYRILLIC("CSISOLATINCYRILLIC"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATINGREEK("CSISOLATINGREEK"),
  
  /**
   * Character encoding of the SRT file
   */
  CSISOLATINHEBREW("CSISOLATINHEBREW"),
  
  /**
   * Character encoding of the SRT file
   */
  CSKOI8R("CSKOI8R"),
  
  /**
   * Character encoding of the SRT file
   */
  CSKSC56011987("CSKSC56011987"),
  
  /**
   * Character encoding of the SRT file
   */
  CSKZ1048("CSKZ1048"),
  
  /**
   * Character encoding of the SRT file
   */
  CSMACINTOSH("CSMACINTOSH"),
  
  /**
   * Character encoding of the SRT file
   */
  CSPC850MULTILINGUAL("CSPC850MULTILINGUAL"),
  
  /**
   * Character encoding of the SRT file
   */
  CSPC862LATINHEBREW("CSPC862LATINHEBREW"),
  
  /**
   * Character encoding of the SRT file
   */
  CSPTCP154("CSPTCP154"),
  
  /**
   * Character encoding of the SRT file
   */
  CSSHIFTJIS("CSSHIFTJIS"),
  
  /**
   * Character encoding of the SRT file
   */
  CSUCS4("CSUCS4"),
  
  /**
   * Character encoding of the SRT file
   */
  CSUNICODE("CSUNICODE"),
  
  /**
   * Character encoding of the SRT file
   */
  CSUNICODE11("CSUNICODE11"),
  
  /**
   * Character encoding of the SRT file
   */
  CSUNICODE11UTF7("CSUNICODE11UTF7"),
  
  /**
   * Character encoding of the SRT file
   */
  CSVISCII("CSVISCII"),
  
  /**
   * Character encoding of the SRT file
   */
  CYRILLIC("CYRILLIC"),
  
  /**
   * Character encoding of the SRT file
   */
  CYRILLIC_ASIAN("CYRILLIC-ASIAN"),
  
  /**
   * Character encoding of the SRT file
   */
  ECMA_114("ECMA-114"),
  
  /**
   * Character encoding of the SRT file
   */
  ECMA_118("ECMA-118"),
  
  /**
   * Character encoding of the SRT file
   */
  ELOT_928("ELOT_928"),
  
  /**
   * Character encoding of the SRT file
   */
  EUC_CN("EUC-CN"),
  
  /**
   * Character encoding of the SRT file
   */
  EUC_JP("EUC-JP"),
  
  /**
   * Character encoding of the SRT file
   */
  EUC_KR("EUC-KR"),
  
  /**
   * Character encoding of the SRT file
   */
  EUC_TW("EUC-TW"),
  
  /**
   * Character encoding of the SRT file
   */
  EUCCN("EUCCN"),
  
  /**
   * Character encoding of the SRT file
   */
  EUCJP("EUCJP"),
  
  /**
   * Character encoding of the SRT file
   */
  EUCKR("EUCKR"),
  
  /**
   * Character encoding of the SRT file
   */
  EUCTW("EUCTW"),
  
  /**
   * Character encoding of the SRT file
   */
  EXTENDED_UNIX_CODE_PACKED_FORMAT_FOR_JAPANESE("EXTENDED_UNIX_CODE_PACKED_FORMAT_FOR_JAPANESE"),
  
  /**
   * Character encoding of the SRT file
   */
  GB_1988_80("GB_1988-80"),
  
  /**
   * Character encoding of the SRT file
   */
  GB_2312_80("GB_2312-80"),
  
  /**
   * Character encoding of the SRT file
   */
  GB18030("GB18030"),
  
  /**
   * Character encoding of the SRT file
   */
  GB2312("GB2312"),
  
  /**
   * Character encoding of the SRT file
   */
  GBK("GBK"),
  
  /**
   * Character encoding of the SRT file
   */
  GEORGIAN_ACADEMY("GEORGIAN-ACADEMY"),
  
  /**
   * Character encoding of the SRT file
   */
  GEORGIAN_PS("GEORGIAN-PS"),
  
  /**
   * Character encoding of the SRT file
   */
  GREEK("GREEK"),
  
  /**
   * Character encoding of the SRT file
   */
  GREEK8("GREEK8"),
  
  /**
   * Character encoding of the SRT file
   */
  HEBREW("HEBREW"),
  
  /**
   * Character encoding of the SRT file
   */
  HP_ROMAN8("HP-ROMAN8"),
  
  /**
   * Character encoding of the SRT file
   */
  HZ("HZ"),
  
  /**
   * Character encoding of the SRT file
   */
  HZ_GB_2312("HZ-GB-2312"),
  
  /**
   * Character encoding of the SRT file
   */
  IBM_CP1133("IBM-CP1133"),
  
  /**
   * Character encoding of the SRT file
   */
  IBM367("IBM367"),
  
  /**
   * Character encoding of the SRT file
   */
  IBM819("IBM819"),
  
  /**
   * Character encoding of the SRT file
   */
  IBM850("IBM850"),
  
  /**
   * Character encoding of the SRT file
   */
  IBM862("IBM862"),
  
  /**
   * Character encoding of the SRT file
   */
  IBM866("IBM866"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_10646_UCS_2("ISO-10646-UCS-2"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_10646_UCS_4("ISO-10646-UCS-4"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_2022_CN("ISO-2022-CN"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_2022_CN_EXT("ISO-2022-CN-EXT"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_2022_JP("ISO-2022-JP"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_2022_JP_1("ISO-2022-JP-1"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_2022_JP_2("ISO-2022-JP-2"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_2022_KR("ISO-2022-KR"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_1("ISO-8859-1"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_10("ISO-8859-10"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_11("ISO-8859-11"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_13("ISO-8859-13"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_14("ISO-8859-14"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_15("ISO-8859-15"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_16("ISO-8859-16"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_2("ISO-8859-2"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_3("ISO-8859-3"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_4("ISO-8859-4"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_5("ISO-8859-5"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_6("ISO-8859-6"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_7("ISO-8859-7"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_8("ISO-8859-8"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_9("ISO-8859-9"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_CELTIC("ISO-CELTIC"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_100("ISO-IR-100"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_101("ISO-IR-101"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_109("ISO-IR-109"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_110("ISO-IR-110"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_126("ISO-IR-126"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_127("ISO-IR-127"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_138("ISO-IR-138"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_14("ISO-IR-14"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_144("ISO-IR-144"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_148("ISO-IR-148"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_149("ISO-IR-149"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_157("ISO-IR-157"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_159("ISO-IR-159"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_165("ISO-IR-165"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_166("ISO-IR-166"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_179("ISO-IR-179"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_199("ISO-IR-199"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_203("ISO-IR-203"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_226("ISO-IR-226"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_57("ISO-IR-57"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_58("ISO-IR-58"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_6("ISO-IR-6"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_IR_87("ISO-IR-87"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_646_IRV_1991("ISO_646.IRV:1991"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_1_1987("ISO_8859-1:1987"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_10_1992("ISO_8859-10:1992"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_14_1998("ISO_8859-14:1998"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_15_1998("ISO_8859-15:1998"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_16_2001("ISO_8859-16:2001"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_2_1987("ISO_8859-2:1987"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_3_1988("ISO_8859-3:1988"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_4_1988("ISO_8859-4:1988"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_5_1988("ISO_8859-5:1988"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_6_1987("ISO_8859-6:1987"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_7_1987("ISO_8859-7:1987"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_7_2003("ISO_8859-7:2003"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_8_1988("ISO_8859-8:1988"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO_8859_9_1989("ISO_8859-9:1989"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO646_CN("ISO646-CN"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO646_JP("ISO646-JP"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO646_US("ISO646-US"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_1("ISO8859-1"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_10("ISO8859-10"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_11("ISO8859-11"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_13("ISO8859-13"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_14("ISO8859-14"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_15("ISO8859-15"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_16("ISO8859-16"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_2("ISO8859-2"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_3("ISO8859-3"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_4("ISO8859-4"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_5("ISO8859-5"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_6("ISO8859-6"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_7("ISO8859-7"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_8("ISO8859-8"),
  
  /**
   * Character encoding of the SRT file
   */
  ISO8859_9("ISO8859-9"),
  
  /**
   * Character encoding of the SRT file
   */
  JAVA("JAVA"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_C6220_1969_RO("JIS_C6220-1969-RO"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_C6226_1983("JIS_C6226-1983"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_X0201("JIS_X0201"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_X0208("JIS_X0208"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_X0208_1983("JIS_X0208-1983"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_X0208_1990("JIS_X0208-1990"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_X0212("JIS_X0212"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_X0212_1990("JIS_X0212-1990"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS_X0212_1990_0("JIS_X0212.1990-0"),
  
  /**
   * Character encoding of the SRT file
   */
  JIS0208("JIS0208"),
  
  /**
   * Character encoding of the SRT file
   */
  JISX0201_1976("JISX0201-1976"),
  
  /**
   * Character encoding of the SRT file
   */
  JOHAB("JOHAB"),
  
  /**
   * Character encoding of the SRT file
   */
  JP("JP"),
  
  /**
   * Character encoding of the SRT file
   */
  KOI8_R("KOI8-R"),
  
  /**
   * Character encoding of the SRT file
   */
  KOI8_RU("KOI8-RU"),
  
  /**
   * Character encoding of the SRT file
   */
  KOI8_T("KOI8-T"),
  
  /**
   * Character encoding of the SRT file
   */
  KOI8_U("KOI8-U"),
  
  /**
   * Character encoding of the SRT file
   */
  KOREAN("KOREAN"),
  
  /**
   * Character encoding of the SRT file
   */
  KS_C_5601_1987("KS_C_5601-1987"),
  
  /**
   * Character encoding of the SRT file
   */
  KS_C_5601_1989("KS_C_5601-1989"),
  
  /**
   * Character encoding of the SRT file
   */
  KSC_5601("KSC_5601"),
  
  /**
   * Character encoding of the SRT file
   */
  KZ_1048("KZ-1048"),
  
  /**
   * Character encoding of the SRT file
   */
  L1("L1"),
  
  /**
   * Character encoding of the SRT file
   */
  L10("L10"),
  
  /**
   * Character encoding of the SRT file
   */
  L2("L2"),
  
  /**
   * Character encoding of the SRT file
   */
  L3("L3"),
  
  /**
   * Character encoding of the SRT file
   */
  L4("L4"),
  
  /**
   * Character encoding of the SRT file
   */
  L5("L5"),
  
  /**
   * Character encoding of the SRT file
   */
  L6("L6"),
  
  /**
   * Character encoding of the SRT file
   */
  L7("L7"),
  
  /**
   * Character encoding of the SRT file
   */
  L8("L8"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN_9("LATIN-9"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN1("LATIN1"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN10("LATIN10"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN2("LATIN2"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN3("LATIN3"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN4("LATIN4"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN5("LATIN5"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN6("LATIN6"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN7("LATIN7"),
  
  /**
   * Character encoding of the SRT file
   */
  LATIN8("LATIN8"),
  
  /**
   * Character encoding of the SRT file
   */
  MAC("MAC"),
  
  /**
   * Character encoding of the SRT file
   */
  MACARABIC("MACARABIC"),
  
  /**
   * Character encoding of the SRT file
   */
  MACCENTRALEUROPE("MACCENTRALEUROPE"),
  
  /**
   * Character encoding of the SRT file
   */
  MACCROATIAN("MACCROATIAN"),
  
  /**
   * Character encoding of the SRT file
   */
  MACCYRILLIC("MACCYRILLIC"),
  
  /**
   * Character encoding of the SRT file
   */
  MACGREEK("MACGREEK"),
  
  /**
   * Character encoding of the SRT file
   */
  MACHEBREW("MACHEBREW"),
  
  /**
   * Character encoding of the SRT file
   */
  MACICELAND("MACICELAND"),
  
  /**
   * Character encoding of the SRT file
   */
  MACINTOSH("MACINTOSH"),
  
  /**
   * Character encoding of the SRT file
   */
  MACROMAN("MACROMAN"),
  
  /**
   * Character encoding of the SRT file
   */
  MACROMANIA("MACROMANIA"),
  
  /**
   * Character encoding of the SRT file
   */
  MACTHAI("MACTHAI"),
  
  /**
   * Character encoding of the SRT file
   */
  MACTURKISH("MACTURKISH"),
  
  /**
   * Character encoding of the SRT file
   */
  MACUKRAINE("MACUKRAINE"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_ANSI("MS-ANSI"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_ARAB("MS-ARAB"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_CYRL("MS-CYRL"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_EE("MS-EE"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_GREEK("MS-GREEK"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_HEBR("MS-HEBR"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_TURK("MS-TURK"),
  
  /**
   * Character encoding of the SRT file
   */
  MS_KANJI("MS_KANJI"),
  
  /**
   * Character encoding of the SRT file
   */
  MS936("MS936"),
  
  /**
   * Character encoding of the SRT file
   */
  MULELAO_1("MULELAO-1"),
  
  /**
   * Character encoding of the SRT file
   */
  NEXTSTEP("NEXTSTEP"),
  
  /**
   * Character encoding of the SRT file
   */
  PT154("PT154"),
  
  /**
   * Character encoding of the SRT file
   */
  PTCP154("PTCP154"),
  
  /**
   * Character encoding of the SRT file
   */
  R8("R8"),
  
  /**
   * Character encoding of the SRT file
   */
  RK1048("RK1048"),
  
  /**
   * Character encoding of the SRT file
   */
  ROMAN8("ROMAN8"),
  
  /**
   * Character encoding of the SRT file
   */
  SHIFT_JIS("SHIFT-JIS"),
  
  /**
   * Character encoding of the SRT file
   */
  SJIS("SJIS"),
  
  /**
   * Character encoding of the SRT file
   */
  STRK1048_2002("STRK1048-2002"),
  
  /**
   * Character encoding of the SRT file
   */
  TCVN("TCVN"),
  
  /**
   * Character encoding of the SRT file
   */
  TCVN_5712("TCVN-5712"),
  
  /**
   * Character encoding of the SRT file
   */
  TCVN5712_1("TCVN5712-1"),
  
  /**
   * Character encoding of the SRT file
   */
  TCVN5712_1_1993("TCVN5712-1:1993"),
  
  /**
   * Character encoding of the SRT file
   */
  TIS_620("TIS-620"),
  
  /**
   * Character encoding of the SRT file
   */
  TIS620("TIS620"),
  
  /**
   * Character encoding of the SRT file
   */
  TIS620_0("TIS620-0"),
  
  /**
   * Character encoding of the SRT file
   */
  TIS620_2529_1("TIS620.2529-1"),
  
  /**
   * Character encoding of the SRT file
   */
  TIS620_2533_0("TIS620.2533-0"),
  
  /**
   * Character encoding of the SRT file
   */
  TIS620_2533_1("TIS620.2533-1"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_2("UCS-2"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_2_INTERNAL("UCS-2-INTERNAL"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_2_SWAPPED("UCS-2-SWAPPED"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_2BE("UCS-2BE"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_2LE("UCS-2LE"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_4("UCS-4"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_4_INTERNAL("UCS-4-INTERNAL"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_4_SWAPPED("UCS-4-SWAPPED"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_4BE("UCS-4BE"),
  
  /**
   * Character encoding of the SRT file
   */
  UCS_4LE("UCS-4LE"),
  
  /**
   * Character encoding of the SRT file
   */
  UHC("UHC"),
  
  /**
   * Character encoding of the SRT file
   */
  UNICODE_1_1("UNICODE-1-1"),
  
  /**
   * Character encoding of the SRT file
   */
  UNICODE_1_1_UTF_7("UNICODE-1-1-UTF-7"),
  
  /**
   * Character encoding of the SRT file
   */
  UNICODEBIG("UNICODEBIG"),
  
  /**
   * Character encoding of the SRT file
   */
  UNICODELITTLE("UNICODELITTLE"),
  
  /**
   * Character encoding of the SRT file
   */
  US("US"),
  
  /**
   * Character encoding of the SRT file
   */
  US_ASCII("US-ASCII"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_16("UTF-16"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_16BE("UTF-16BE"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_16LE("UTF-16LE"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_32("UTF-32"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_32BE("UTF-32BE"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_32LE("UTF-32LE"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_7("UTF-7"),
  
  /**
   * Character encoding of the SRT file
   */
  UTF_8("UTF-8"),
  
  /**
   * Character encoding of the SRT file
   */
  VISCII("VISCII"),
  
  /**
   * Character encoding of the SRT file
   */
  VISCII1_1_1("VISCII1.1-1"),
  
  /**
   * Character encoding of the SRT file
   */
  WCHAR_T("WCHAR_T"),
  
  /**
   * Character encoding of the SRT file
   */
  WINBALTRIM("WINBALTRIM"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1250("WINDOWS-1250"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1251("WINDOWS-1251"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1252("WINDOWS-1252"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1253("WINDOWS-1253"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1254("WINDOWS-1254"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1255("WINDOWS-1255"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1256("WINDOWS-1256"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1257("WINDOWS-1257"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_1258("WINDOWS-1258"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_874("WINDOWS-874"),
  
  /**
   * Character encoding of the SRT file
   */
  WINDOWS_936("WINDOWS-936"),
  
  /**
   * Character encoding of the SRT file
   */
  X0201("X0201"),
  
  /**
   * Character encoding of the SRT file
   */
  X0208("X0208"),
  
  /**
   * Character encoding of the SRT file
   */
  X0212("X0212");

  private String value;

  CaptionCharacterEncoding(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CaptionCharacterEncoding fromValue(String text) {
    for (CaptionCharacterEncoding b : CaptionCharacterEncoding.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

