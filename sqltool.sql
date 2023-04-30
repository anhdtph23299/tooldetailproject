Create database ToolDetailProject;
use ToolDetailProject;
Create table Framework(
	IDFramework bigint not null auto_increment primary key,
    FrameworkName varchar(100) not null
);
Create table `Account`(
	IDAccount bigint not null auto_increment primary key,
    `Name` varchar(100) not null,
    Email varchar(30) not null,
    Phone varchar(15) not null,
    Username varchar(20) not null,
    Passwork varchar(20) not null
);
Create table `Role`(
	IDRole bigint not null auto_increment primary key,
    RoleName varchar(100) not null,
    `Description` varchar(255) not null
);
Create table `Member`(
	IDMember bigint not null auto_increment primary key,
    MemberCode varchar(15) not null,
    `MemberName` varchar(255) not null
);
Create table Project(
	IDProject bigint not null auto_increment primary key,
    ProjectName varchar(255) not null,
    `Status` varchar(15) not null,
    StartTime date not null,
    EndTime date,
	Images LONGBLOB not null,
    `Description` varchar(255) not null,
    IDAccount bigint ,
    foreign key(IDAccount) references `Account`(IDAccount)
);
Create table FrameworkProject(
	IDFramework bigint not null,
    IDProject bigint not null,
    foreign key(IDFramework) references Framework(IDFramework),
    foreign key(IDProject) references Project(IDProject),
    Primary key(IDFramework,IDProject)
);
Create table ProjectMember(
	IDProject bigint not null,
    IDMember bigint not null,
    IDRole bigint not null,
    StartJoin Date ,
    Task varchar(255),
    foreign key(IDProject) references Project(IDProject),
    foreign key(IDMember) references `Member`(IDMember),
    foreign key(IDRole) references `Role`(IDRole),
    primary key(IDProject,IDMember,IDRole)
);
Create table Tool(
	IDTool bigint not null auto_increment primary key,
    ToolName varchar(30) not null
);
Create table IDE(
	IDIDE bigint not null auto_increment primary key,
    IDEName varchar(30) not null
);
Create table ToolProject(
	IDProject bigint not null,
    IDTool bigint not null,
    foreign key(IDProject) references Project(IDProject),
    foreign key(IDTool) references Tool(IDTool),
    primary key(IDProject,IDTool)
);
Create table IDEProject(
	IDProject bigint not null,
    IDIDE bigint not null,
    foreign key(IDIDE) references IDE(IDIDE),
	foreign key(IDProject) references Project(IDProject),
    primary key(IDProject,IDIDE)
);