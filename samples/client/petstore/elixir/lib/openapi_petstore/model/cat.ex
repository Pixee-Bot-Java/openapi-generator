# NOTE: This file is auto generated by OpenAPI Generator 7.7.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.Cat do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :className,
    :color,
    :declawed
  ]

  @type t :: %__MODULE__{
    :className => String.t,
    :color => String.t | nil,
    :declawed => boolean() | nil
  }

  def decode(value) do
    value
  end
end

