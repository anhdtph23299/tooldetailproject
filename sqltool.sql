Create database ToolDetailProject;
use ToolDetailProject;
Create table Framework(
	id bigint not null auto_increment primary key,
    framework_name varchar(100) not null
);
Create table `Account`(
	id bigint not null auto_increment primary key,
    `Name` varchar(100) not null,
    Email varchar(30) not null,
    Phone varchar(15) not null,
    user_name varchar(20) not null,
    password varchar(20) not null,
    roll INT not null
);


Create table `Role`(
	id bigint not null auto_increment primary key,
    role_name varchar(100) not null,
    `Description` varchar(255) not null
);
Create table `Member`(
	id bigint not null auto_increment primary key,
    member_code varchar(15) not null,
    `member_name` varchar(255) not null
);
Create table Project(
	id bigint not null auto_increment primary key,
    project_name varchar(255) not null,
    `Status` varchar(15) not null,
    start_time date not null,
    end_time date,
    images LONGBLOB null,
    `Description` varchar(255) not null
);
Create table FrameworkProject(
	id_framework bigint not null,
    id_project bigint not null,
    foreign key(id_framework) references Framework(id),
    foreign key(id_project) references Project(id),
    Primary key(id_framework,id_project)
);
Create table ProjectMember(
	id_project bigint not null,
    id_member bigint not null,
    id_role bigint not null,
    start_join Date ,
    Task varchar(255),
    foreign key(id_project) references Project(id),
    foreign key(id_member) references `Member`(id),
    foreign key(id_role) references `Role`(id),
    primary key(id_project,id_member,id_role)
);
Create table Tool(
	id bigint not null auto_increment primary key,
    tool_name varchar(30) not null
);
Create table IDE(
	id bigint not null auto_increment primary key,
    ide_name varchar(30) not null
);
Create table ToolProject(
	id_project bigint not null,
    id_tool bigint not null,
    foreign key(id_project) references Project(id),
    foreign key(id_tool) references Tool(id),
    primary key(id_project,id_tool)
);
Create table IDEProject(
	id_project bigint not null,
    id_ide bigint not null,
    foreign key(id_ide) references IDE(id),
	foreign key(id_project) references Project(id),
    primary key(id_project,id_ide)
);

-- account 
CREATE TABLE `account_project` (
   id_account bigint NOT NULL auto_increment primary key,
   id_project bigint NOT NULL,
   description VARCHAR(45) NOT NULL,
   edit_time DATE NOT NULL,
	foreign key(id_account) references `Account`(id),
	foreign key(id_project) references `Project`(id)
);