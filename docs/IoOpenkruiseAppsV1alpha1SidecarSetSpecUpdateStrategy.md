
# IoKruiseAppsV1alpha1SidecarSetSpecUpdateStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxUnavailable** | **Object** | The maximum number of SidecarSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total number of SidecarSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. |  [optional]
**partition** | **Object** | Partition is the desired number of pods in old revisions. It means when partition is set during pods updating, (replicas - partition) number of pods will be updated. Default value is 0. |  [optional]
**paused** | **Boolean** | Paused indicates that the SidecarSet is paused to update the injected pods, but it don&#39;t affect the webhook inject sidecar container into the newly created pods. default is false |  [optional]
**priorityStrategy** | [**IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategy**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategy.md) |  |  [optional]
**scatterStrategy** | [**List&lt;IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy&gt;**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyScatterStrategy.md) | ScatterStrategy defines the scatter rules to make pods been scattered when update. This will avoid pods with the same key-value to be updated in one batch. - Note that pods will be scattered after priority sort. So, although priority strategy and scatter strategy can be applied together, we suggest to use either one of them. - If scatterStrategy is used, we suggest to just use one term. Otherwise, the update order can be hard to understand. |  [optional]
**selector** | [**IoKruiseAppsV1alpha1SidecarSetSpecUpdateStrategySelector**](IoKruiseAppsV1alpha1SidecarSetSpecUpdateStrategySelector.md) |  |  [optional]
**type** | **String** | Type is NotUpdate, the SidecarSet don&#39;t update the injected pods, it will only inject sidecar container into the newly created pods. Type is RollingUpdate, the SidecarSet will update the injected pods to the latest version on RollingUpdate Strategy. default is RollingUpdate |  [optional]



