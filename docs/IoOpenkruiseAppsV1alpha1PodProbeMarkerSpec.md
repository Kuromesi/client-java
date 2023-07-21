
# IoKruiseAppsV1alpha1PodProbeMarkerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**probes** | [**List&lt;IoKruiseAppsV1alpha1PodProbeMarkerSpecProbes&gt;**](IoKruiseAppsV1alpha1PodProbeMarkerSpecProbes.md) | Custom container probe, current only support Exec(). Probe Result will record in Pod.Status.Conditions, and condition.type&#x3D;probe.name. condition.status&#x3D;True indicates probe success condition.status&#x3D;False indicates probe fails | 
**selector** | [**IoKruiseAppsV1alpha1PodProbeMarkerSpecSelector**](IoKruiseAppsV1alpha1PodProbeMarkerSpecSelector.md) |  | 



