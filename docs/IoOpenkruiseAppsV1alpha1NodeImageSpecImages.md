
# IoKruiseAppsV1alpha1NodeImageSpecImages

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pullSecrets** | [**List&lt;IoKruiseAppsV1alpha1NodeImageSpecPullSecrets&gt;**](IoKruiseAppsV1alpha1NodeImageSpecPullSecrets.md) | PullSecrets is an optional list of references to secrets in the same namespace to use for pulling the image. If specified, these secrets will be passed to individual puller implementations for them to use.  For example, in the case of docker, only DockerConfig type secrets are honored. |  [optional]
**sandboxConfig** | [**IoKruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig**](IoKruiseAppsV1alpha1ImageListPullJobSpecSandboxConfig.md) |  |  [optional]
**tags** | [**List&lt;IoKruiseAppsV1alpha1NodeImageSpecTags&gt;**](IoKruiseAppsV1alpha1NodeImageSpecTags.md) | Tags is a list of versions of this image | 



