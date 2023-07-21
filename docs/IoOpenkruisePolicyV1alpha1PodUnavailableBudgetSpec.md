
# IoKruisePolicyV1alpha1PodUnavailableBudgetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxUnavailable** | **Object** | Delete pod, evict pod or update pod specification is allowed if at most \&quot;maxUnavailable\&quot; pods selected by \&quot;selector\&quot; or \&quot;targetRef\&quot;  are unavailable after the above operation for pod. MaxUnavailable and MinAvailable are mutually exclusive, MaxUnavailable is priority to take effect |  [optional]
**minAvailable** | **Object** | Delete pod, evict pod or update pod specification is allowed if at least \&quot;minAvailable\&quot; pods selected by \&quot;selector\&quot; or \&quot;targetRef\&quot; will still be available after the above operation for pod. |  [optional]
**selector** | [**IoKruisePolicyV1alpha1PodUnavailableBudgetSpecSelector**](IoKruisePolicyV1alpha1PodUnavailableBudgetSpecSelector.md) |  |  [optional]
**targetRef** | [**IoKruisePolicyV1alpha1PodUnavailableBudgetSpecTargetRef**](IoKruisePolicyV1alpha1PodUnavailableBudgetSpecTargetRef.md) |  |  [optional]



