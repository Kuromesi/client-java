
# IoKruiseAppsV1alpha1PersistentPodStateStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**observedGeneration** | **Long** | observedGeneration is the most recent generation observed for this PersistentPodState. It corresponds to the PersistentPodState&#39;s generation, which is updated on mutation by the API Server. | 
**podStates** | [**Map&lt;String, IoKruiseAppsV1alpha1PersistentPodStateStatusPodStates&gt;**](IoKruiseAppsV1alpha1PersistentPodStateStatusPodStates.md) | When the pod is ready, record some status information of the pod, such as: labels, annotations, topologies, etc. map[string]PodState -&gt; map[Pod.Name]PodState |  [optional]



