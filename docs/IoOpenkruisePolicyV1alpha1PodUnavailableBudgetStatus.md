
# IoKruisePolicyV1alpha1PodUnavailableBudgetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentAvailable** | **Integer** | CurrentAvailable current number of available pods | 
**desiredAvailable** | **Integer** | DesiredAvailable minimum desired number of available pods | 
**disruptedPods** | [**Map&lt;String, OffsetDateTime&gt;**](OffsetDateTime.md) | DisruptedPods contains information about pods whose eviction or deletion was processed by the API handler but has not yet been observed by the PodUnavailableBudget. |  [optional]
**observedGeneration** | **Long** | Most recent generation observed when updating this PUB status. UnavailableAllowed and other status information is valid only if observedGeneration equals to PUB&#39;s object generation. |  [optional]
**totalReplicas** | **Integer** | TotalReplicas total number of pods counted by this unavailable budget | 
**unavailableAllowed** | **Integer** | UnavailableAllowed number of pod unavailable that are currently allowed | 
**unavailablePods** | [**Map&lt;String, OffsetDateTime&gt;**](OffsetDateTime.md) | UnavailablePods contains information about pods whose specification changed(inplace-update pod), once pod is available(consistent and ready) again, it will be removed from the list. |  [optional]



