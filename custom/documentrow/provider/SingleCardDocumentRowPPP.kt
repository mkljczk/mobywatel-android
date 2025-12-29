package pl.gov.coi.common.ui.ds.custom.documentrow.provider

import android.content.Context
import androidx.compose.ui.res.colorResource
import pl.gov.coi.common.domain.Mapper
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.R
import pl.gov.coi.common.ui.ds.custom.documentrow.DocumentRowData
import pl.gov.coi.common.ui.ds.statusbadge.StatusBadgeData
import pl.gov.coi.common.ui.ds.statusbadge.StatusBadgeWithIconStatus
import pl.gov.coi.common.ui.preview.CustomWrappedDataPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestDataProvider
import pl.gov.coi.common.ui.preview.WrappedValue

data class ProvidedSingleCardDocumentRowData(
  val previewName: String,
  val data: DocumentRowData,
)

class SingleCardDocumentRowPPP : CustomWrappedDataPreviewParameterProvider
  &lt;Unit, DocumentRowData, Mapper&lt;Unit, DocumentRowData&gt;, ProvidedSingleCardDocumentRowData&gt;() {

  override fun mapper(context: Context): Mapper&lt;Unit, DocumentRowData&gt; {
    return object : Mapper&lt;Unit, DocumentRowData&gt; {
      override fun invoke(p1: Unit): DocumentRowData = getSingleCardDocument()
    }
  }

  private val cards = mapOf(
    &quot;SingleCardDocumentRow&quot; to getSingleCardDocument(),
    &quot;SingleCardDocumentRowWithDescription&quot; to getSingleCardDocumentWithDescription(),
    &quot;SingleCardDocumentRowWithStatus&quot; to getSingleCardDocumentWithStatus(),
    &quot;SingleCardDocumentRowWithDescriptionStatus&quot; to getSingleCardDocumentWithDescriptionStatus(),
  )

  override val screenShotTestValues: Sequence&lt;ScreenShotTestDataProvider&lt;ProvidedSingleCardDocumentRowData&gt;&gt;
    get() = cards.map { (testName, cardData) -&gt;
      ScreenShotTestDataProvider(
        screenShotTestName = testName,
        wrappedValue = WrappedValue {
          ProvidedSingleCardDocumentRowData(
            previewName = testName,
            data = cardData,
          )
        },
      )
    }.asSequence()

  private fun getSingleCardDocument() = DocumentRowData(
    title = &quot;Legitymacja poselska&quot;.toLabel(),
    iconColorProvider = { colorResource(id = R.color.coi_mobywatel_feature_dashboard_deputy_card_primary) },
    iconResId = R.drawable.db012_legitymacja_poselska,
    badgeData = null,
    onClick = {},
  )

  private fun getSingleCardDocumentWithDescription() = getSingleCardDocument().copy(
    description = &quot;Opis dokumentu&quot;.toLabel(),
  )

  private fun getSingleCardDocumentWithStatus() = getSingleCardDocument().copy(
    badgeData = StatusBadgeData.WithIcon(
      label = &quot;Błąd pobierania&quot;.toLabel(),
      withBorder = false,
      status = StatusBadgeWithIconStatus.NEGATIVE,
    ),
  )

  private fun getSingleCardDocumentWithDescriptionStatus() = getSingleCardDocumentWithDescription().copy(
    badgeData = StatusBadgeData.WithIcon(
      label = &quot;Błąd pobierania&quot;.toLabel(),
      withBorder = false,
      status = StatusBadgeWithIconStatus.NEGATIVE,
    ),
  )
}
