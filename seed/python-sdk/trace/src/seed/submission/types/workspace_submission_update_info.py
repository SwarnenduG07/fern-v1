# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import typing

import pydantic
import typing_extensions
from ...core.pydantic_utilities import IS_PYDANTIC_V2, UniversalBaseModel
from ...core.serialization import FieldMetadata
from .error_info import ErrorInfo
from .exception_info import ExceptionInfo
from .exception_v_2 import ExceptionV2
from .running_submission_state import RunningSubmissionState


class WorkspaceSubmissionUpdateInfo_Running(UniversalBaseModel):
    value: RunningSubmissionState
    type: typing.Literal["running"] = "running"

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True


class WorkspaceSubmissionUpdateInfo_Ran(UniversalBaseModel):
    type: typing.Literal["ran"] = "ran"
    exception_v_2: typing_extensions.Annotated[typing.Optional[ExceptionV2], FieldMetadata(alias="exceptionV2")] = None
    exception: typing.Optional[ExceptionInfo] = None
    stdout: str

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class WorkspaceSubmissionUpdateInfo_Stopped(UniversalBaseModel):
    type: typing.Literal["stopped"] = "stopped"

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class WorkspaceSubmissionUpdateInfo_Traced(UniversalBaseModel):
    type: typing.Literal["traced"] = "traced"

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class WorkspaceSubmissionUpdateInfo_TracedV2(UniversalBaseModel):
    type: typing.Literal["tracedV2"] = "tracedV2"
    trace_responses_size: typing_extensions.Annotated[int, FieldMetadata(alias="traceResponsesSize")]

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


class WorkspaceSubmissionUpdateInfo_Errored(UniversalBaseModel):
    value: ErrorInfo
    type: typing.Literal["errored"] = "errored"

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True


class WorkspaceSubmissionUpdateInfo_Finished(UniversalBaseModel):
    type: typing.Literal["finished"] = "finished"

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow


WorkspaceSubmissionUpdateInfo = typing.Union[
    WorkspaceSubmissionUpdateInfo_Running,
    WorkspaceSubmissionUpdateInfo_Ran,
    WorkspaceSubmissionUpdateInfo_Stopped,
    WorkspaceSubmissionUpdateInfo_Traced,
    WorkspaceSubmissionUpdateInfo_TracedV2,
    WorkspaceSubmissionUpdateInfo_Errored,
    WorkspaceSubmissionUpdateInfo_Finished,
]
