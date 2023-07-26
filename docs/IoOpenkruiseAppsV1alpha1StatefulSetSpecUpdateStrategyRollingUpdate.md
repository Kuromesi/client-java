
# IoKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inPlaceUpdateStrategy** | [**IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyInPlaceUpdateStrategy**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyInPlaceUpdateStrategy.md) |  |  [optional]
**maxUnavailable** | **Object** | The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. Also, maxUnavailable can just be allowed to work with Parallel podManagementPolicy. Defaults to 1. |  [optional]
**minReadySeconds** | **Integer** | MinReadySeconds indicates how long will the pod be considered ready after it&#39;s updated. MinReadySeconds works with both OrderedReady and Parallel podManagementPolicy. It affects the pod scale up speed when the podManagementPolicy is set to be OrderedReady. Combined with MaxUnavailable, it affects the pod update speed regardless of podManagementPolicy. Default value is 0, max is 300. |  [optional]
**partition** | **Integer** | Partition indicates the ordinal at which the StatefulSet should be partitioned by default. But if unorderedUpdate has been set:   - Partition indicates the number of pods with non-updated revisions when rolling update.   - It means controller will update $(replicas - partition) number of pod. Default value is 0. |  [optional]
**paused** | **Boolean** | Paused indicates that the StatefulSet is paused. Default value is false |  [optional]
**podUpdatePolicy** | **String** | PodUpdatePolicy indicates how pods should be updated Default value is \&quot;ReCreate\&quot; |  [optional]
**unorderedUpdate** | [**IoKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdateUnorderedUpdate**](IoKruiseAppsV1alpha1StatefulSetSpecUpdateStrategyRollingUpdateUnorderedUpdate.md) |  |  [optional]



