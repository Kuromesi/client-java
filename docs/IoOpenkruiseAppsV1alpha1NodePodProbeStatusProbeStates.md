
# IoKruiseAppsV1alpha1NodePodProbeStatusProbeStates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastProbeTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time we probed the condition. |  [optional]
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the condition transitioned from one status to another. |  [optional]
**message** | **String** | If Status&#x3D;True, Message records the return result of Probe. If Status&#x3D;False, Message records Probe&#39;s error message |  [optional]
**name** | **String** | Name is podProbeMarker.Name#probe.Name | 
**state** | **String** | container probe exec state, True or False | 



