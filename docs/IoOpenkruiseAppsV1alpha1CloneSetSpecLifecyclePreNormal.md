
# IoKruiseAppsV1alpha1CloneSetSpecLifecyclePreNormal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finalizersHandler** | **List&lt;String&gt;** |  |  [optional]
**labelsHandler** | **Map&lt;String, String&gt;** |  |  [optional]
**markPodNotReady** | **Boolean** | MarkPodNotReady &#x3D; true means: - Pod will be set to &#39;NotReady&#39; at preparingDelete/preparingUpdate state. - Pod will be restored to &#39;Ready&#39; at Updated state if it was set to &#39;NotReady&#39; at preparingUpdate state. Currently, MarkPodNotReady only takes effect on InPlaceUpdate &amp; PreDelete hook. Default to false. |  [optional]



