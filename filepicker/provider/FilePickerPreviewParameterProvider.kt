package pl.gov.coi.common.ui.ds.filepicker.provider

import android.graphics.BitmapFactory
import android.util.Base64
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import pl.gov.coi.common.domain.label.toLabel
import pl.gov.coi.common.ui.ds.filepicker.model.FilePickerData
import pl.gov.coi.common.ui.ds.filepicker.model.PickerFile
import pl.gov.coi.common.ui.ds.filepicker.model.PickerFile.Image.LeadingImageData
import pl.gov.coi.common.ui.preview.ScreenShotTestDataProvider
import pl.gov.coi.common.ui.preview.WrappedValue
import java.util.Locale

internal class FilePickerPreviewParameterProvider : PreviewParameterProvider&lt;WrappedValue&lt;FilePickerData&gt;&gt; {

  private val userMockedPhoto by lazy {
    Base64.decode(mockedPhoto, Base64.NO_WRAP).run {
      BitmapFactory.decodeByteArray(this, 0, size)
    }
  }

  override val values: Sequence&lt;WrappedValue&lt;FilePickerData&gt;&gt;
    get() = screenShotTestValues.map { it.wrappedValue }

  val screenShotTestValues = sequenceOf(
    testScreenshotProvider(
      name = &quot;FileUploaderWithoutFiles&quot;,
      files = { emptyList() },
      maxAllowedFiles = 10,
    ),
    testScreenshotProvider(
      name = &quot;FileUploaderWithoutFilesWithError&quot;,
      files = { emptyList() },
      maxAllowedFiles = 10,
      error = &quot;Adding file is required&quot;,
    ),
    testScreenshotProvider(
      name = &quot;FileUploaderWithFilesSizeWhichNotExceedLimit&quot;,
      files = { createMixedFiles(numberOfFiles = 2, longNames = false) },
      maxAllowedFiles = 8,
    ),
    testScreenshotProvider(
      name = &quot;FileUploaderWithFilesSizeWhichNotExceedLimitLongNames&quot;,
      files = { createMixedFiles(numberOfFiles = 2, longNames = true) },
      maxAllowedFiles = 8,
    ),
    testScreenshotProvider(
      name = &quot;FileUploaderWithFilesSizeSameAsLimit&quot;,
      files = { createMixedFiles(numberOfFiles = 4, longNames = false) },
      maxAllowedFiles = 4,
    ),
    testScreenshotProvider(
      name = &quot;FileUploaderWithFilesSizeSameAsLimitLongNames&quot;,
      files = { createMixedFiles(numberOfFiles = 4, longNames = true) },
      maxAllowedFiles = 4,
    ),
  )

  private fun testScreenshotProvider(
    name: String,
    files: @Composable () -&gt; List&lt;PickerFile&gt;,
    maxAllowedFiles: Int,
    error: String? = null,
  ) =
    ScreenShotTestDataProvider(
      screenShotTestName = name,
      wrappedValue = WrappedValue {
        FilePickerData(
          addFileLabel = &quot;Add file&quot;.toLabel(&quot;&quot;),
          errorLabel = error?.toLabel(&quot;&quot;),
          files = files(),
          requirements = listOf(
            &quot;Dopuszczalne formaty: .jpg, .jpeg, .png, .pdf.&quot;.toLabel(&quot;&quot;),
            &quot;Maksymalny rozmiar plików: 96,4 MB.&quot;.toLabel(&quot;&quot;),
            &quot;Dopuszczalna liczba plików: 4.&quot;.toLabel(&quot;&quot;),
          ),
          onAddFileClicked = {},
          maxAllowedFiles = maxAllowedFiles,
        )
      },
    )

  @Composable
  private fun createMixedFiles(numberOfFiles: Int, longNames: Boolean) = buildList {
    repeat(numberOfFiles) { index -&gt;
      val innerIndex = index + 1
      val isEven = (innerIndex % 2) == 0
      add(
        if (isEven) {
          createRegularFile(index = innerIndex, longName = longNames)
        } else {
          createImageFile(index = innerIndex, longName = longNames)
        },
      )
    }
  }

  private fun createRegularFile(index: Int, longName: Boolean) = PickerFile.Regular(
    title = createTitle(index = index, longName = longName),
    description = (String.format(Locale.ENGLISH, &quot;%.2f&quot;, index * 2.372) + &quot; MB&quot;).toLabel(&quot;&quot;),
    onDeleteClick = {},
  )

  private fun createTitle(index: Int, longName: Boolean) = buildString {
    append(&quot;File $index &quot;)
    if (longName) {
      repeat(12) {
        append(&quot;Very &quot;)
      }
      append(&quot;Long Text&quot;)
    }
  }.toLabel(&quot;&quot;)

  @Composable
  private fun createImageFile(index: Int, longName: Boolean) = PickerFile.Image(
    title = createTitle(index = index, longName = longName),
    description = (String.format(Locale.ENGLISH, &quot;%.2f&quot;, index * 2.372) + &quot; MB&quot;).toLabel(&quot;&quot;),
    onDeleteClick = {},
    onImageClick = {},
    leadingImageData = LeadingImageData.Image(bitmap = userMockedPhoto),
  )

  private val mockedPhoto = &quot;iVBORw0KGgoAAAANSUhEUgAAALQAAADGCAYAAAB7J6r4AAAAAXNSR0IArs4c6QAAAA&quot; +
    &quot;RnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAA7DSURBVHhe7Z37VxRHFoCLGYYZnoO8VFQQBUQUENS4GpMYY3Sj++cmumtcY9zd&quot; +
    &quot;YzQKiA9UZMUHisjwfjMMO3dsTrLKdPdM36quun2/czzp8ReVfF1zq+6tews6uro3BMMQIWT9l2FIwEIzpGChGVKw0AwpWGiGFCw0QwoWmiEFC8&quot; +
    &quot;2QgoVmSMFCM6RgoRlSsNAMKVhohhQsNEMKFpohBQvNkIKFZkjBQjOkYKEZUvCdQovqXVHR2FUmCkIF1u98zttnC2JsaFlsbPCPTFcCL3RDR5mo&quot; +
    &quot;bYxZn9yxsrguHl6fsj4xOhHokKPnUk3OMgPRkrA4+rcaEQpnX80Zfwik0KF0WAFCFnj0sfuHalFRG7E+MToQSKG7L1ZbT95pOREXsbKw9Ynxm8&quot; +
    &quot;AJDasqNofObLOeGL8JlNCR4pC0uLftdKX1xPhJoITuOCtvJS2tLLSeGD8JjNChdJhb4HUX6EDrybj1xPhFYIRu7KqwnuRRXs0nHn4TGKGr6ous&quot; +
    &quot;J7lw6OEvgRC6vErdynngSw47/CQQQu//Qn64sQnE6Xb1IIxcAiF0uFCtYHuPlFlPjGrIC936F/UhQFV91HpiVENe6PIaf04eVMbtzB+QFrq4wr&quot; +
    &quot;8aC5VxO/MHpIVu/9q/GgvVcTvzEbJCS04KuqL9Gy5aUg1ZoRu6/D9pKC7nslLVkBW6ZnfuN1FkUFGtJkPJfISk0Dqln1tO8uZQJSSFbjmhl0Qh&quot; +
    &quot;st+D+kHyRx2O6PXP2neMV2lVkBO6+Xi59aQP8TqOo1VBTuj4dj3TzhV1nDlUASmhoxrfvt5/lMMOFZASuv0rfS+qclMaNZASWndp2s/wzXDZkB&quot; +
    &quot;F6d3up9aQvxWV8PUs2ZITevq/YetKbCj7xkAoJoU1qxdXCZaVSISF02ymzYtMQl5ZKg4TQ4SKzBNEtNU8J44Xe16NfZtCJsm2cZJGF8UJvM/RC&quot; +
    &quot;atUePcpbqWG00NFScwvo93bof8xoIkYLfegbcxMV3IxGDkYLbboUHeeqrCcGC2OFrm8tsZ7MpShm/BZGO4z9ie4kIDQQ38GZQ0yMFLqwiM7K1s&quot; +
    &quot;y3WVAx0ox2gzeDWxGO+LMXgE6pRcUhESsrFCUVhZkSgkKf/i5YGDlJFmYMUmJhOime/Hva+oQPvDA1e2KirimWFjj3o87Z8VUxNrwk5ibXhNDc&quot; +
    &quot;FuOE3tNRJurymP6qO/d+nLCecIAz+rbT8fSKi/8lPD6yLEYfL4hUSj91jBOa2uq8yejgQmYV9ArcMN+maKO5kRJi8OaUWJpft37Hf4yKoU3ODD&quot; +
    &quot;qxq81b5rD1VEXmZVclM1CQtqf9zDbRc6laVG7X47TGKKEPUW5+mN6L5ZMo2nO4LCNyeZV/QsHmcv/xjy9Uic9dq4wSGlYEynR+5/6FhdMIEKhu&quot; +
    &quot;r177iYOnK0XXef8yoMYosqOFRiLFjsKou/8dDemNcdcF/JnlWECeAF62SEx9iGiM0LsO0Bf6+Z056yk7sPrVGnLK03lum/IBSkYIHYSeFv/tmx&quot; +
    &quot;Mz4yvWp8+B0c6w6pmWJa3eHVMaghjx0/FztIQKHt6YElOjNjIXFojuH8w9rtwMQVRghNDRUrNWpVzo/3tCrNic48IJQvdf9Y2Xc6HnknyptTdl&quot; +
    &quot;R7MZ/Tbyof9qQqwn7fNacMZLBZh7c+SC3PBDe6G9Jhx0Zei3GbG+ai+zqq9plUDvbpkxtdZCR0tohhofXi2L2Yk169PWUJR5E4ip97TLObXS2h&quot; +
    &quot;iKY9E2NjbEq4F569PWBKFvR92+EikLltbFSRRXqd6fJtJSWx+2oLgsnKmPkMXok0Uxkf6GSK6mrN/JTk1DTDR2yj1Hxq4y1Fbo+gMlYiex7OBI&quot; +
    &quot;/5xIvMl+PAfIeImTKylx/9qkp1pm+NaoqMWvF5lLrIlnt2asT97RNuSgJjOsyk4yywix+q4kxP2fvckMDN2ezaymqXXc9a+8OpJeVq0PCNDcdW&quot; +
    &quot;nI/asJ6yk7mJNn15bXpQgIL8jIfecUfS5gnrNrKfThs7T6VcBZ8/qavVgdOVTaOQFx8sC1KesTPonXK2IAVn0koLQBK6WvpdDUjusG/2V/XxAS&quot; +
    &quot;Dvnc9duKkYF5MfZ80fokj7V0XI65oev8HueF1s4cih3uVxbsryjtO4bTQTXxZlkkXi1bn9Tw5D84l3shxY/RCUs7oal1uH/1wP7MGahEmK0IYc&quot; +
    &quot;1Iv/Ofhc3CVFKMDeN8IzQhtEbWSugilwXuJvHhpf2KmdnlIwBFTn4xOogjNMZ9SK0MOvBl3HqiAWQFndiLsCq9R7gt7pXen3BeKK+bQ71W6BJa&quot; +
    &quot;t7pfDixYT9nB+FZ6M+j858gGXt6kQ+WgGxq7vBWjaSM0ZAapkXhtH27A6YZX3j6Vf6LhlkfXvR8VVtZ5209oIzS1zKAbmrq9hxvvhvQR2k19iC&quot; +
    &quot;MeX3IthMZYqXTDqXAfMHU+jB0z46vWkwc8+KCF0Ie+pVcmujyftJ7kMfnOvjbEDzDamXmZCqyF0FFim0FgegxhpXIAGibqxnzC/uKCG6BTar74&quot; +
    &quot;LnRck55o2DgJjdGaYW0ZIWbVEOhZnS++C918nObtjNUle9kwjutcHHMbiZeX3VehKc+8dirbDEfp/tu94uVF9VXoA6doZQZzwbQOSCrxcurl60&quot; +
    &quot;8V5noElSC0N/MD34Sua6LbQMYNGDdJ+KX4HN+E3nOI9qxrp/0BRlatkOjgTuNiaIqZwU+JOsiWdOia5IYWpIsBmBTHvYeRXvTwRehD39K6M7gV&quot; +
    &quot;8Z32aW2MM+RYuX57kO1N3ntXewnHfBGaaouvP+M0RAfrNjZcXdIJ6AftlYWZ/MsGlJslo1mJjkAHJBXsltQjLh9CCHcCAS8XFpQLHYS+bYCqpJ&quot; +
    &quot;FOp0Ud53CKzLxU7CkVOkw4M5gPM+9xCphUzzHJhg7JIqV/g/3HgrE6b+JUBjl8F6cDEUbc6hWsnnzrSW+bZaVCl9fg3HA2hV0H7c/a3VyidYuK&quot; +
    &quot;cQ/ZwOz1POFwS94JZUJX7aZ3O8OJzAGEQ5SFcm0pDfxZB7+qtD6po7wqkun1jMWbJ96ulCkTurFDvySACpxmCr68j9ccpiReqDQDC3uiVuwCM4&quot; +
    &quot;9fWsqEhjl7QaThsP2GbRppY7gJnHo0K9irRKIhcQR5OtfoU+83cJQIffgsvTuDuRAttX+b5ydx7x/GdxRJHZ1ctSsqOr/Hz/aODXm/j6hEaIp3&quot; +
    &quot;BnOh/Wv72PbZb3gd7DfZHG4PYQgmneeqUdovfMrqkn1DS7dIFxqrd5vJQJlnsU3t90Zqw1Xbg3yAjWLPxWoR85C5hPQ6JMTgBYnE5OQSHv+K1M&quot; +
    &quot;VU9owVioN/8gFO6GBgUDYK0ktLz0X5P6v3L5YyX+1Opyuh9N8Hip9UnJzAy4zVbFKq0JkZ1UTG+mIw0jcrEqPZN4EgNIitEpgskLLchj87nP4i&quot; +
    &quot;UV3wBI0esc7kpf749iF01qTE3m7704fey7gjztwQTsfakejHXxB3q5Z5cSaJmmCSKnScYDd+rzQ7NHSfxWilZRBO4zpyRZrQVBvIeAVecrtFcO&quot; +
    &quot;jOrPVEH4y2YZ8iTej9R4NViJQLRxzOiN2MsaDAqIS+1tKEVr25MQnYLJdUZj/GcxpjQYFHN3FDjU2kaHfwdHAbyLjl4Gn74zDMOYC6Acd0y7Ny&quot; +
    &quot;urNKEbqkkpMpbmg+kf3FhzmAWJV4uiFzwBG60KXIqVbKxGsjtrd47l+lt0pPvpUbTqEL3eZDTa7JdJ23L/KhtkF80Sv334MqNKRLmdyA6alQvZ&quot; +
    &quot;YN2CBCrQcFHt+UN398E1QFm/ioLi+cqtf6rvg3VBOLjfR2YGkWp6LODlShnZqrMNk5bDNnBjLD0+/1m6eSC71X1KT10YSmOHReJXAJoLAo+wZx&quot; +
    &quot;+HecG+J+8PphOm5WFDWhCc2FSN7pOm+fQRz42bzQA1qejY+oSxShCc1NZHBo6Mx+B3FtZUOsLMiPQzFRPVQfRWid+quZTm1DzLZs4OEv8k8KsI&quot; +
    &quot;CVGbEy1BUoQtc2BrsbPzZOlyJG+s2IpzOxs2JQhObRCLjA2fTO1uzfeok3+p94qA41NkGLoRlc6tNC290euWdzP9FvluaT0i79OsFCa0z3RZvQ&quot; +
    &quot;I+3L2LC3tlmyeHxDTmmoG1hojYEFuqIue+Xi6OCi8k2XE1jtCPIFRWgqtQY60vKFfW15nw8Xa7MBqe2lOTl1zm5BEXrKYVA7442O7+zT4qNP9Q&quot; +
    &quot;g9VBQfOYEi9Itec9OyJlBUHLYdtDQ25L/QD6/rUbuNFkNjTXVitubwWfu66T6fjsmA1eWUWFnU43YNmtAP/mlOBstUOm2G8qSSG75V5D24ps/N&quot; +
    &quot;GjSh4f7bDMfSUonEwplf2fCjIm/otl59RNCEBp7fnRUpPvGQit0qDfT/Q13oAWHm7Ae9FjFUoYG+ywmxPG9WRZhpNNmU6kLzxclRNaGHjjdp0I&quot; +
    &quot;UGHt2YEs8D1NJKNVX19gOYXvTJDz0GNIqb/4wUoQGYBnrvxwkji9JNwGkkhMxTDxi8jzF8XwbSG57rSteFKlEY8f4+D96cFouSugBlAya2RotD&quot; +
    &quot;jkPeD5yMizIJExRgodIVaSs0Iw84UXKSGXh6awa91kP3UJKFJg7mGXHmaFbz/tUsNHGgR940Un7AhNZkLHQAGL7rPUww5S4jCx0QvJwZryykjL&quot; +
    &quot;ltzkIHBMjqzYznl3B5+Iv+ocYmLHSAeH5nTuQ6cerpLX9voOQKCx0w+q+4X21nP6yJ+YS/N1ByhYUOGFA85mbcxfT7VTF0G38GuWxY6AACR3mQ&quot; +
    &quot;7Zt69/lxHqS0ey8nxPDvZtbicOrbI36kvpns8ArNkIKFZkjBQjOkYKEZUrDQDCkCK/TaEs7hTnItkIdE2hJYoafHcC6Sri7xhWCdCKzQuraiZb&quot; +
    &quot;wRWKFTCAurialh6gR6Uwg9RPLlY5OVNesTowuBFhoKdR79mt9NDArjiikSaKGB5bn1nJum6DzfJOgEtjhpK+rbSsTO5q2nT0Fd/PCdWTGjWS83&quot; +
    &quot;5v9hoRlSBD7kYGjBQjOkYKEZUrDQDClYaIYULDRDChaaIQULzZCChWZIwUIzpGChGVKw0AwpWGiGFCw0QwoWmiEFC82QgoVmSMFCM6RgoRlSsN&quot; +
    &quot;AMKVhohhQsNEMKFpohBQvNEEKI/wHB37T6AQz2eAAAAABJRU5ErkJggg==\n&quot;
}
