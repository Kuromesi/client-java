
# IoKruiseAppsV1alpha1PodProbeMarkerSpecProbes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerName** | **String** | container name | 
**markerPolicy** | [**List&lt;IoKruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy&gt;**](IoKruiseAppsV1alpha1PodProbeMarkerSpecMarkerPolicy.md) | According to the execution result of ContainerProbe, perform specific actions, such as: patch Pod labels, annotations, ReadinessGate Condition It cannot be null at the same time as PodConditionType. |  [optional]
**name** | **String** | probe name, unique within the Pod(Even between different containers, they cannot be the same) | 
**podConditionType** | **String** | If it is not empty, the Probe execution result will be recorded on the Pod condition. It cannot be null at the same time as MarkerPolicy. For example PodConditionType&#x3D;game.kruise.io/healthy, pod.status.condition.type &#x3D; game.kruise.io/healthy. When probe is Succeeded, pod.status.condition.status &#x3D; True. Otherwise, when the probe fails to execute, pod.status.condition.status &#x3D; False. |  [optional]
**probe** | [**IoKruiseAppsV1alpha1NodePodProbeSpecProbe**](IoKruiseAppsV1alpha1NodePodProbeSpecProbe.md) |  | 



