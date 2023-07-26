
# IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderPriority** | [**List&lt;IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority&gt;**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyOrderPriority.md) | Order priority terms, pods will be sorted by the value of orderedKey. For example: &#x60;&#x60;&#x60; orderPriority: - orderedKey: key1 - orderedKey: key2 &#x60;&#x60;&#x60; First, all pods which have key1 in labels will be sorted by the value of key1. Then, the left pods which have no key1 but have key2 in labels will be sorted by the value of key2 and put behind those pods have key1. |  [optional]
**weightPriority** | [**List&lt;IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority&gt;**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategyPriorityStrategyWeightPriority.md) | Weight priority terms, pods will be sorted by the sum of all terms weight. |  [optional]



