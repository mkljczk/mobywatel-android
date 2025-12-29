package pl.gov.coi.common.ui.ds.chatbubble.provider

import pl.gov.coi.common.ui.ds.chatbubble.ChatBubbleData
import pl.gov.coi.common.ui.ds.chatbubble.ClickableContent
import pl.gov.coi.common.ui.ds.chatbubble.Content
import pl.gov.coi.common.ui.ds.chatbubble.ContentType
import pl.gov.coi.common.ui.ds.chatbubble.FooterData
import pl.gov.coi.common.ui.ds.chatbubble.FooterActionData
import pl.gov.coi.common.ui.ds.chatbubble.SourcesData
import pl.gov.coi.common.ui.preview.CustomPreviewParameterProvider
import pl.gov.coi.common.ui.preview.ScreenShotTestData

class ChatBubblePreviewParameterProvider : CustomPreviewParameterProvider&lt;ChatBubbleData&gt;() {

  override val screenShotTestValues: Sequence&lt;ScreenShotTestData&lt;ChatBubbleData&gt;&gt; = sequenceOf(
    ScreenShotTestData(
      screenShotTestName = &quot;ChatBubbleBotLoading&quot;,
      value = provideChatBubbleBotLoadingPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ChatBubbleBot&quot;,
      value = provideChatBubbleBotPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ChatBubbleUser&quot;,
      value = provideChatBubbleUserPreviewData(),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ChatBubbleBotWithOptionsWithSources&quot;,
      value = provideChatBubbleBotWithOptionsPreviewData(
        sourcesData = SourcesData(
          title = &quot;Źródło&quot;.toLabel(),
          showMoreButtonLabel = &quot;+ X więcej&quot;.toLabel(),
          showLessButtonLabel = &quot;Pokaż mniej&quot;.toLabel(),
          items = listOf(
            ClickableContent(
              value = &quot;1. Gov.pl&quot;,
              onClick = {},
            ),
            ClickableContent(
              value = &quot;2. Gov.pl&quot;,
              onClick = {},
            ),
            ClickableContent(
              value = &quot;3. Gov.pl&quot;,
              onClick = {},
            ),
          ),
        ),
      ),
    ),
    ScreenShotTestData(
      screenShotTestName = &quot;ChatBubbleBotWithOptionsWithoutSources&quot;,
      value = provideChatBubbleBotWithOptionsPreviewData(
        sourcesData = null,
      ),
    ),
  )

  private fun provideChatBubbleBotLoadingPreviewData() =
    ChatBubbleData.IncomingMessage(
      label = &quot;Wirtualny asystent&quot;.toLabel(),
    )

  private fun provideChatBubbleBotPreviewData() =
    ChatBubbleData.IncomingMessage(
      label = &quot;Wirtualny asystent&quot;.toLabel(),
      isLoading = false,
      content = listOf(
        Content(
          type = ContentType.TEXT,
          value = &quot;Treść odpowiedzi bota - jakaś dłuższa, żeby było widać jak wygląda wielolinijkowo. &quot; +
            &quot;Dalsza część odpowiedzi, jeszcze trochę znaków.&quot;,
        ),
      ),
    )

  private fun provideChatBubbleUserPreviewData() =
    ChatBubbleData.OutgoingMessage(
      content = listOf(
        Content(
          type = ContentType.TEXT,
          value = &quot;Treść pytania użytkownika&quot;,
        ),
      ),
    )

  private fun provideChatBubbleBotWithOptionsPreviewData(sourcesData: SourcesData?) =
    ChatBubbleData.IncomingMessage(
      label = &quot;Wirtualny asystent&quot;.toLabel(),
      isLoading = false,
      content = listOf(
        Content(
          type = ContentType.TEXT,
          value = &quot;To jest jakiś tekst, a tutaj jest &quot;,
        ),
        Content(
          type = ContentType.LINK,
          value = &quot;link&quot;,
          url = &quot;www.gov.pl&quot;,
        ),
        Content(
          type = ContentType.TEXT,
          value = &quot;. To wszystko jest z naszego źródła &quot;,
        ),
        Content(
          type = ContentType.SOURCE,
          value = &quot;(1)&quot;,
          url = &quot;www.gov.pl&quot;,
        ),
        Content(
          type = ContentType.TEXT,
          value = &quot;. Dalszy tekst.&quot;,
        ),
      ),
      additionalInfo = &quot;Odpowiedź 2 z 10&quot;.toLabel(),
      footerData = FooterData(
        sourcesData = sourcesData,
        actionsData = listOf(
          FooterActionData.Toggleable.PositiveRate(isSelected = true, onToggle = {}),
          FooterActionData.Toggleable.NegativeRate(isSelected = false, onToggle = {}),
          FooterActionData.Share(onClick = {}),
        ),
      ),
      actions = listOf(
        ClickableContent(
          value = &quot;Zgłoś naruszenie&quot;,
          onClick = {},
        ),
        ClickableContent(
          value = &quot;Akcja&quot;,
          onClick = {},
        ),
      ),
      suggestions = listOf(
        ClickableContent(
          value = &quot;Jak założyć profil zaufany?&quot;,
          onClick = {},
        ),
        ClickableContent(
          value = &quot;Jak złożyć wniosek o dodatek elektryczny?&quot;,
          onClick = {},
        ),
      ),
      onUrlClick = {},
    )
}
