
# IoKruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Map&lt;String, String&gt;** | Patch annotations pod.annotations |  [optional]
**labels** | **Map&lt;String, String&gt;** | Patch Labels pod.labels |  [optional]
**state** | **String** | probe status, True or False For example: State&#x3D;Succeeded, annotations[controller.kubernetes.io/pod-deletion-cost] &#x3D; &#39;10&#39;. State&#x3D;Failed, annotations[controller.kubernetes.io/pod-deletion-cost] &#x3D; &#39;-10&#39;. In addition, if State&#x3D;Failed is not defined, Exec execution fails, and the annotations[controller.kubernetes.io/pod-deletion-cost] will be Deleted | 



