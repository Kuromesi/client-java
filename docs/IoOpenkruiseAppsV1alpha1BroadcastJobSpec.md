
# IoKruiseAppsV1alpha1BroadcastJobSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionPolicy** | [**IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy**](IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecCompletionPolicy.md) |  |  [optional]
**failurePolicy** | [**IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecFailurePolicy**](IoKruiseAppsV1alpha1AdvancedCronJobSpecTemplateBroadcastJobTemplateSpecFailurePolicy.md) |  |  [optional]
**parallelism** | **Object** | Parallelism specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when the work left to do is less than max parallelism. Not setting this value means no limit. |  [optional]
**paused** | **Boolean** | Paused will pause the job. |  [optional]
**template** | **Object** | Template describes the pod that will be created when executing a job. | 



