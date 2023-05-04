Create database ToolDetailProject;
use ToolDetailProject;
Create table Framework(
	id_framework bigint not null auto_increment primary key,
    framework_name varchar(100) not null
);
Create table `Account`(
	id_account bigint not null auto_increment primary key,
    `Name` varchar(100) not null,
    Email varchar(30) not null,
    Phone varchar(15) not null,
    user_name varchar(20) not null,
    pass_work varchar(20) not null
);
Create table `Role`(
	id_role bigint not null auto_increment primary key,
    role_name varchar(100) not null,
    `Description` varchar(255) not null
);
Create table `Member`(
	id_member bigint not null auto_increment primary key,
    member_code varchar(15) not null,
    `member_name` varchar(255) not null
);
Create table Project(
	id_project bigint not null auto_increment primary key,
    project_name varchar(255) not null,
    `Status` varchar(15) not null,
    start_time date not null,
    end_time date,
    images LONGBLOB not null,
    `Description` varchar(255) not null,
    id_account bigint ,
    foreign key(id_account) references `Account`(id_account)
);
Create table FrameworkProject(
	id_framework bigint not null,
    id_project bigint not null,
    foreign key(id_framework) references Framework(id_framework),
    foreign key(id_project) references Project(id_project),
    Primary key(id_framework,id_project)
);
Create table ProjectMember(
	id_project bigint not null,
    id_member bigint not null,
    id_role bigint not null,
    start_join Date ,
    Task varchar(255),
    foreign key(id_project) references Project(id_project),
    foreign key(id_member) references `Member`(id_member),
    foreign key(id_role) references `Role`(id_role),
    primary key(id_project,id_member,id_role)
);
Create table Tool(
	id_tool bigint not null auto_increment primary key,
    tool_name varchar(30) not null
);
Create table IDE(
	id_ide bigint not null auto_increment primary key,
    ide_name varchar(30) not null
);
Create table ToolProject(
	id_project bigint not null,
    id_tool bigint not null,
    foreign key(id_project) references Project(id_project),
    foreign key(id_tool) references Tool(id_tool),
    primary key(id_project,id_tool)
);
Create table IDEProject(
	id_project bigint not null,
    id_ide bigint not null,
    foreign key(id_ide) references IDE(id_ide),
	foreign key(id_project) references Project(id_project),
    primary key(id_project,id_ide)
);