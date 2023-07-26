
# IoKruiseAppsV1alpha1ImageListPullJobSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionPolicy** | [**IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy**](IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy.md) |  | 
**images** | **List&lt;String&gt;** | Images is the image list to be pulled by the job | 
**parallelism** | **Object** | Parallelism is the requested parallelism, it can be set to any non-negative value. If it is unspecified, it defaults to 1. If it is specified as 0, then the Job is effectively paused until it is increased. |  [optional]
**podSelector** | [**IoKruiseAppsV1alpha1ImageListPullJobSpecPodSelector**](IoKruiseAppsV1alpha1ImageListPullJobSpecPodSelector.md) |  |  [optional]
**pullPolicy** | [**IoKruiseAppsV1alpha1ImageListPullJobSpecPullPolicy**](IoKruiseAppsV1alpha1ImageListPullJobSpecPullPolicy.md) |  |  [optional]
**pullSecrets** | **List&lt;String&gt;** | ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling the image. If specified, these secrets will be passed to individual puller implementations for them to use.  For example, in the case of docker, only DockerConfig type secrets are honored. |  [optional]
**sandboxConfig** | [**IoKruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig**](IoKruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig.md) |  |  [optional]
**selector** | [**IoKruiseAppsV1alpha1ImageListPullJobSpecSelector**](IoKruiseAppsV1alpha1ImageListPullJobSpecSelector.md) |  |  [optional]



