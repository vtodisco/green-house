create index IX_18BD4DE4 on gh_Carpentry (code_[$COLUMN_LENGTH:75$]);
create index IX_D901EFDD on gh_Carpentry (name[$COLUMN_LENGTH:75$]);
create index IX_E9CCE512 on gh_Carpentry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_290F8814 on gh_Carpentry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_756CF85E on gh_Cart (userId);
create index IX_9D4B4518 on gh_Cart (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3292319A on gh_Cart (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9A9D746A on gh_Color (name[$COLUMN_LENGTH:75$]);
create index IX_86CFE1F on gh_Color (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D30C8061 on gh_Color (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_67B57D9A on gh_Environment (name[$COLUMN_LENGTH:75$]);
create index IX_4550BF4F on gh_Environment (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_174ECD91 on gh_Environment (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5D115C6B on gh_Handle (name[$COLUMN_LENGTH:75$]);
create index IX_62C7ECA0 on gh_Handle (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_38A31B22 on gh_Handle (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8741FC8A on gh_Item (carpentryId);
create index IX_E58C166 on gh_Item (cartId);
create index IX_8FDD0387 on gh_Item (environmentId);
create index IX_EE8BAE2E on gh_Item (handleId);
create index IX_95B55B9D on gh_Item (profileId);
create index IX_DA09CD8B on gh_Item (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E62E3ACD on gh_Item (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_57B657F1 on gh_Profile (code_[$COLUMN_LENGTH:75$]);
create index IX_56E8F030 on gh_Profile (name[$COLUMN_LENGTH:75$]);
create index IX_19AF00E5 on gh_Profile (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F85C7CA7 on gh_Profile (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_DD139C99 on gh_Profile_Carpentry (carpentryId);
create index IX_8F62CDCC on gh_Profile_Carpentry (uuid_[$COLUMN_LENGTH:75$]);