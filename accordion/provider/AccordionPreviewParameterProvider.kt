package pl.gov.coi.common.ui.ds.accordion.provider

import androidx.compose.runtime.Composable
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.ds.accordion.AccordionData
import pl.gov.coi.common.ui.ds.accordion.AccordionElement
import pl.gov.coi.common.ui.ds.accordion.CustomAccordionContent
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData
import pl.gov.coi.common.ui.text.CustomText
import pl.gov.coi.common.ui.timeline.Timeline
import pl.gov.coi.common.ui.timeline.TimelineData
import pl.gov.coi.common.ui.timeline.TimelineItemData
import pl.gov.coi.common.ui.unmapped.cardlist.ColumnCardList
import pl.gov.coi.common.ui.unmapped.cardlist.model.CardListData
import pl.gov.coi.common.ui.unmapped.singlecard.BodySection
import pl.gov.coi.common.ui.unmapped.singlecard.BodyTitleSection
import pl.gov.coi.common.ui.unmapped.singlecard.DefaultSingleCardData
import pl.gov.coi.common.ui.unmapped.singlecard.SingleCardLabel

class AccordionPreviewParameterProvider : CustomPreviewParameterProvider&lt;AccordionData&gt;() {

  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;AccordionData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;AccordionSingle&quot;,
      value = provideAccordionSinglePreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AccordionSingleExpanded&quot;,
      value = provideAccordionSingleExpandedPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AccordionSingleHistoryExpanded&quot;,
      value = provideAccordionSingleHistoryExpandedPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AccordionList&quot;,
      value = provideAccordionListPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AccordionListOneExpanded&quot;,
      value = provideAccordionListOneExpandedPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;AccordionSingleCardContent&quot;,
      value = provideAccordionSingleCardPreviewData(),
    ),
  )

  private fun provideAccordionSingleCardPreviewData() = AccordionData(
    elements = listOf(
      AccordionElement(
        header = &quot;Accordion single header&quot;.toLabel(),
        addContentPadding = false,
        content = object : CustomAccordionContent {
          @Composable
          override fun Content() {
            ColumnCardList(
              data = CardListData(
                singleCardList = listOf(
                  DefaultSingleCardData(
                    bodySection = BodySection(
                      title = BodyTitleSection.Title(
                        singleCardLabel = SingleCardLabel(
                          label = &quot;SingleCard 1&quot;.toLabel(),
                        ),
                      ),
                    ),
                  ),
                  DefaultSingleCardData(
                    bodySection = BodySection(
                      title = BodyTitleSection.Title(
                        singleCardLabel = SingleCardLabel(
                          label = &quot;SingleCard 2&quot;.toLabel(),
                        ),
                      ),
                    ),
                  ),
                  DefaultSingleCardData(
                    bodySection = BodySection(
                      title = BodyTitleSection.Title(
                        singleCardLabel = SingleCardLabel(
                          label = &quot;SingleCard 3&quot;.toLabel(),
                        ),
                      ),
                    ),
                  ),
                ),
              ),
            )
          }
        },
        initialExpanded = true,
        onListExpanded = {},
      ),
    ),
  )

  private fun provideAccordionSinglePreviewData() =
    AccordionData(
      elements = listOf(
        AccordionElement(
          header = &quot;Accordion single header&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = false,
          onListExpanded = {},
        ),
      ),
    )

  private fun provideAccordionSingleExpandedPreviewData() =
    AccordionData(
      elements = listOf(
        AccordionElement(
          header = &quot;Accordion expanded header&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = true,
          onListExpanded = {},
        ),
      ),
    )

  private fun provideAccordionSingleHistoryExpandedPreviewData() =
    AccordionData(
      elements = listOf(
        AccordionElement(
          header = &quot;Accordion history expanded header&quot;.toLabel(),
          content = CustomTimelineAccordionContent(),
          initialExpanded = true,
          onListExpanded = {},
        ),
      ),
    )

  private fun provideAccordionListPreviewData() =
    AccordionData(
      elements = listOf(
        AccordionElement(
          header = &quot;Accordion header 1&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = false,
          onListExpanded = {},
        ),
        AccordionElement(
          header = &quot;Accordion header 2&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = false,
          onListExpanded = {},
        ),
        AccordionElement(
          header = &quot;Accordion header 3&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = false,
          onListExpanded = {},
        ),
      ),
    )

  private fun provideAccordionListOneExpandedPreviewData() =
    AccordionData(
      elements = listOf(
        AccordionElement(
          header = &quot;Accordion header 1 expanded&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = true,
          onListExpanded = {},
        ),
        AccordionElement(
          header = &quot;Accordion header 2&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = false,
          onListExpanded = {},
        ),
        AccordionElement(
          header = &quot;Accordion header 3&quot;.toLabel(),
          content = CustomTextAccordionContent(),
          initialExpanded = false,
          onListExpanded = {},
        ),
      ),
    )

  private class CustomTextAccordionContent : CustomAccordionContent {
    @Composable
    override fun Content() {
      CustomText(label = &quot;Provide content here&quot;.toLabel(&quot;&quot;))
    }
  }

  private class CustomTimelineAccordionContent : CustomAccordionContent {
    @Composable
    override fun Content() {
      Timeline(
        data = TimelineData(
          items = listOf(
            TimelineItemData(
              label = &quot;02.08.2023 12:00&quot;.toLabel(&quot;&quot;),
              title = &quot;Primary Bold&quot;.toLabel(&quot;&quot;),
              description = &quot;Urząd Stanu Cywilnego w Bolesławcu&quot;.toLabel(&quot;&quot;),
            ),
            TimelineItemData(
              label = &quot;01.08.2023 12:00&quot;.toLabel(&quot;&quot;),
              title = &quot;Primary Bold&quot;.toLabel(&quot;&quot;),
            ),
          ),
        ),
      )
    }
  }
}
