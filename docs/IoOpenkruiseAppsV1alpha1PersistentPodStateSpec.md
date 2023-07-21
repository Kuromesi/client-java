
# IoKruiseAppsV1alpha1PersistentPodStateSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**persistentPodAnnotations** | [**List&lt;IoKruiseAppsV1alpha1PersistentPodStateSpecPersistentPodAnnotations&gt;**](IoKruiseAppsV1alpha1PersistentPodStateSpecPersistentPodAnnotations.md) | Persist the annotations information of the pods that need to be saved |  [optional]
**persistentPodStateRetentionPolicy** | **String** | PersistentPodStateRetentionPolicy describes the policy used for PodState. The default policy of &#39;WhenScaled&#39; causes when scale down statefulSet, deleting it. |  [optional]
**preferredPersistentTopology** | [**List&lt;IoKruiseAppsV1alpha1PersistentPodStateSpecPreferredPersistentTopology&gt;**](IoKruiseAppsV1alpha1PersistentPodStateSpecPreferredPersistentTopology.md) | Pod rebuilt topology preferred for node labels, with xx weight for example  kubernetes.io/hostname, failure-domain.beta.kubernetes.io/zone |  [optional]
**requiredPersistentTopology** | [**IoKruiseAppsV1alpha1PersistentPodStateSpecRequiredPersistentTopology**](IoKruiseAppsV1alpha1PersistentPodStateSpecRequiredPersistentTopology.md) |  |  [optional]
**targetRef** | [**IoKruiseAppsV1alpha1PersistentPodStateSpecTargetRef**](IoKruiseAppsV1alpha1PersistentPodStateSpecTargetRef.md) |  | 



