
# IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inPlaceUpdateStrategy** | [**IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyInPlaceUpdateStrategy**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyInPlaceUpdateStrategy.md) |  |  [optional]
**maxSurge** | **Object** | The maximum number of pods that can be scheduled above the desired replicas during update or specified delete. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up. Defaults to 0. |  [optional]
**maxUnavailable** | **Object** | The maximum number of pods that can be unavailable during update or scale. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up by default. When maxSurge &gt; 0, absolute number is calculated from percentage by rounding down. Defaults to 20%. |  [optional]
**partition** | **Object** | Partition is the desired number of pods in old revisions. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding up by default. It means when partition is set during pods updating, (replicas - partition value) number of pods will be updated. Default value is 0. |  [optional]
**paused** | **Boolean** | Paused indicates that the CloneSet is paused. Default value is false |  [optional]
**priorityStrategy** | [**IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategy**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategy.md) |  |  [optional]
**scatterStrategy** | [**List&lt;IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy&gt;**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy.md) | ScatterStrategy defines the scatter rules to make pods been scattered when update. This will avoid pods with the same key-value to be updated in one batch. - Note that pods will be scattered after priority sort. So, although priority strategy and scatter strategy can be applied together, we suggest to use either one of them. - If scatterStrategy is used, we suggest to just use one term. Otherwise, the update order can be hard to understand. |  [optional]
**type** | **String** | Type indicates the type of the CloneSetUpdateStrategy. Default is ReCreate. |  [optional]



