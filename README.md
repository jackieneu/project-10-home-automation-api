# Home Automation REST API | Techdegree Project 10

## Project Prompt

Great news, you’ve been contracted to build a home automation REST API. The API will maintain the state of all the devices controlled, and another team will come and implement how to actually control the hardware.

In order to keep things dynamic, it has been requested that the API can help design the home and devices, so we’ll need to be able to create rooms, devices and their controls.

The basic breakdown is as follows:

Rooms are named, have a size and contain devices. Devices have Controls. All controls can be set using an integer.
eg:

- Power - 1 - and 0 can be used for boolean values.
- Volume - 9 - can be used for levels
- Temperature - 73 - can be used to set to the perfect temperature

The client has asked that the API be discoverable, so you should probably put your Spring Data REST skills to work. They have also asked that you secure the API, track who modified the control last and add some specific validations and searching capabilities.

## Minimum Viable Product:

- Create a Spring Data REST project to serve the HATEOAS compliant API. Use the Spring Boot Gradle plugin for your dependencies

- Build entities and relationships between Room, Device, Control, and User based on the included diagram

- Build repositories that can be paged and sorted for each of the entities

- Expose the API under /api/v1/

- Secure the API so that only authenticated users can view details

- Ensure that the users repository is not exported

- Secure the API so that only users with the ROLE_ADMIN role can create rooms

- Validate that room’s area is less than 1000 (sq ft/sq meters) and ensure friendly JSON messages are returned to the caller

- Create documentation that is exposed in Hypermedia Application Language (HAL) for the Room.area field for fellow developers who will use your API that explain that the value should represent either square meters or square footage depending on your units of measure.

- Add a search resource that provides the ability to find Devices based on a partial name.

- Track the last user to modify the control and report it in control.lastModifiedBy

- Ensure that control modifications are versioned so that clients can use appropriate E-Tags

## Extra Credit:
- Add tests to validate all requested additional configuration

- Add additional searches to find rooms by name and less than a specified area

- Ensure that only Room Administrators can add and modify Devices and Controls
