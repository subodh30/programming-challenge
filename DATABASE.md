# Database Schema

## Location Table
The `Location` table stores information about different locations. It has the following columns:

- `premId`: A unique identifier for each location, represented as a string with a maximum length of 255 characters.
- `name`: The name of the location, represented as a string with a maximum length of 255 characters.
- `address`: The address of the location, represented as a string with a maximum length of 255 characters.
- `city`: The city where the location is situated, represented as a string with a maximum length of 255 characters.
- `state`: The state where the location is situated, represented as a string with a maximum length of 255 characters.
- `postcode`: The postal code of the location, represented as a string with a maximum length of 255 characters.
- `latitude`: The latitude coordinate of the location, represented as a decimal number with a precision of 9 digits and a scale of 6.
- `longitude`: The longitude coordinate of the location, represented as a decimal number with a precision of 9 digits and a scale of 6.

This table provides a structure to store detailed information about various locations, including their names, addresses, geographic coordinates, and other related attributes.

## Movement Table
The `Movement` table captures the movement of items or goods between different locations. It includes the following columns:

- `origin_premId`: The identifier of the location from where the movement originates, represented as a string with a maximum length of 255 characters.
- `destination_premId`: The identifier of the location where the movement is destined, represented as a string with a maximum length of 255 characters.
- `account_or_company`: Represents the account or company associated with the movement, represented as a string with a maximum length of 255 characters.
- `new_movementreason`: Specifies the reason for the movement, represented as a string with a maximum length of 255 characters.
- `new_species`: Indicates the species or type of items being moved, represented as a string with a maximum length of 255 characters.
- `new_numitemsmoved`: The number of items being moved, represented as an integer.
- `new_shipmentsstartdate`: The start date of the movement, represented as a date data type.

This table enables the tracking and recording of movements between locations, including relevant details such as the origin and destination, the reason for movement, the species or type of items being moved, the quantity, and the start date of the shipment.

## Population Table
The `Population` table stores population data related to specific locations. It consists of the following columns:

- `premiseid`: The identifier of the location for which the population data is recorded, represented as a string with a maximum length of 255 characters.
- `total_animal`: The total number of animals associated with the location, represented as an integer.

This table allows the storage of population information for various locations, indicating the total number of animals present at each location. It can be used for statistical analysis, tracking changes in population over time, or any other relevant purposes.

These three tables collectively provide a structured database schema for storing and managing data related to locations, movements between locations, and population information. The schema facilitates organizing and retrieving information in a structured manner, allowing efficient data management and analysis.
