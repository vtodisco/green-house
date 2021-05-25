create table gh_Carpentry (
	uuid_ VARCHAR(75) null,
	carpentryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	img VARCHAR(256) null,
	price DOUBLE,
	shutters INTEGER,
	specificationId LONG
);

create table gh_Cart (
	uuid_ VARCHAR(75) null,
	cartId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	displayDate DATE null,
	total DOUBLE,
	invoiceDiscount BOOLEAN,
	vat DOUBLE,
	totalWithVat DOUBLE,
	discountedTotal DOUBLE,
	offerId LONG,
	invoiceId LONG,
	installation BOOLEAN,
	installationTotal DOUBLE,
	delivery BOOLEAN,
	deliveryTotal DOUBLE,
	status INTEGER
);

create table gh_Color (
	uuid_ VARCHAR(75) null,
	colorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	code_ VARCHAR(75) null,
	img VARCHAR(256) null,
	charge INTEGER
);

create table gh_Environment (
	uuid_ VARCHAR(75) null,
	environmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null
);

create table gh_Handle (
	uuid_ VARCHAR(75) null,
	handleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	price DOUBLE,
	img VARCHAR(256) null
);

create table gh_Item (
	uuid_ VARCHAR(75) null,
	itemId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	displayDate DATE null,
	environmentId LONG,
	profileId LONG,
	carpentryId LONG,
	handleId LONG,
	colorId LONG,
	cartId LONG,
	qty INTEGER,
	price DOUBLE,
	width DOUBLE,
	height DOUBLE,
	color VARCHAR(75) null
);

create table gh_Profile (
	uuid_ VARCHAR(75) null,
	profileId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	price DOUBLE,
	img VARCHAR(256) null
);

create table gh_Profile_Carpentry (
	uuid_ VARCHAR(75) null,
	profileId LONG not null,
	carpentryId LONG not null,
	primary key (profileId, carpentryId)
);