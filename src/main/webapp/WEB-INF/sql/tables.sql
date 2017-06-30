create table tupa_TpAPI (
	methodsDescription VARCHAR(75) not null primary key
);

create table tupa_TpContact (
	id_ INTEGER not null primary key,
	email VARCHAR(75) null,
	phone VARCHAR(75) null,
	title VARCHAR(75) null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	url VARCHAR(75) null,
	description_EN VARCHAR(75) null,
	description_FI VARCHAR(75) null
);

create table tupa_TpInfrastructure (
	id_ INTEGER not null primary key,
	urn VARCHAR(75) null,
	name_EN VARCHAR(75) null,
	name_FI VARCHAR(75) null,
	acronym_EN VARCHAR(75) null,
	acronym_FI VARCHAR(75) null,
	description_EN VARCHAR(75) null,
	description_FI VARCHAR(75) null,
	active_ BOOLEAN,
	preparationsStarted INTEGER,
	buildingStarted INTEGER,
	operationsStarted INTEGER,
	operationsFinished INTEGER,
	formerIds VARCHAR(75) null,
	formerUrns VARCHAR(75) null
);

create table tupa_TpOrganisation (
	id_ INTEGER not null primary key,
	name_EN VARCHAR(75) null,
	name_FI VARCHAR(75) null,
	isni VARCHAR(75) null,
	motherOrganisationsIds INTEGER,
	country VARCHAR(75) null
);

create table tupa_TpService (
	id_ INTEGER not null primary key,
	name_EN VARCHAR(75) null,
	name_FI VARCHAR(75) null,
	description_EN VARCHAR(75) null,
	description_FI VARCHAR(75) null,
	url VARCHAR(75) null,
	address VARCHAR(75) null,
	city VARCHAR(75) null,
	lat DOUBLE,
	lon DOUBLE
);

create table tupa_TpServize (
	id_ INTEGER not null primary key,
	name_EN VARCHAR(75) null,
	name_FI VARCHAR(75) null,
	description_EN VARCHAR(75) null,
	description_FI VARCHAR(75) null,
	url VARCHAR(75) null,
	address VARCHAR(75) null,
	city VARCHAR(75) null,
	lat DOUBLE,
	lon DOUBLE
);