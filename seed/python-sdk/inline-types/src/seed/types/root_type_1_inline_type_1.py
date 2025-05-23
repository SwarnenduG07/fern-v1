# This file was auto-generated by Fern from our API Definition.

from ..core.pydantic_utilities import UniversalBaseModel
import pydantic
from .root_type_1_inline_type_1_nested_inline_type_1 import RootType1InlineType1NestedInlineType1
from .reference_type import ReferenceType
from ..core.pydantic_utilities import IS_PYDANTIC_V2
import typing


class RootType1InlineType1(UniversalBaseModel):
    """
    lorem ipsum
    """

    foo: str = pydantic.Field()
    """
    lorem ipsum
    """

    bar: RootType1InlineType1NestedInlineType1 = pydantic.Field()
    """
    lorem ipsum
    """

    ref: ReferenceType = pydantic.Field()
    """
    lorem ipsum
    """

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="allow", frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True
            extra = pydantic.Extra.allow
