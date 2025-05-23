# This file was auto-generated by Fern from our API Definition.

import typing

import pydantic
from ........core.pydantic_utilities import IS_PYDANTIC_V2, UniversalBaseModel
from .......commons.types.language import Language


class GetFunctionSignatureResponse(UniversalBaseModel):
    function_by_language: typing.Dict[Language, str] = pydantic.Field(alias="functionByLanguage")

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:

        class Config:
            extra = pydantic.Extra.forbid
