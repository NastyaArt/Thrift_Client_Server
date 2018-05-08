namespace java server

typedef i32 int
typedef list<Equipment> EquipmentList
typedef list<Cabinet> CabinetList
typedef list<Responsible> ResponsibleList
typedef list<Distribution> DistributionList
typedef list<Writeoff> WriteoffList

struct Equipment{
	1: int code;
    2: string category;
    3: string name;
	4: int cost;
	5: string producer;
	6: string receiptDate;
}

struct Cabinet{
	1: int code;
    2: string name;
	3: int codeResponsible;
}

struct Responsible{
	1: int code;
    2: string fio;
	3: string phone;
}

struct Distribution{
	1: int code;
	2: int codeCabinet;
	3: int codeEquipment;
	4: int number;
    5: string date;
}

struct Writeoff{
	1: int code;
	2: int codeCabinet;
	3: int codeEquipment;
	4: int number;
    5: string date;
	6: string cause;
}

service MySQLServiceEquipment
{
    EquipmentList getEquipment();
	CabinetList getCabinet();
	ResponsibleList getResponsible();
	DistributionList getDistribution();
	WriteoffList getWriteoff();
	
	void addEquipment(1:Equipment equipment);
	void addCabinet(1:Cabinet cabinet);
	void addResponsible(1:Responsible responsible);
	void addDistribution(1:Distribution distribution);
	void addWriteoff(1:Writeoff writeoff);
	
	void delEquipment(1:int code);
	void delCabinet(1:int code);
	void delResponsible(1:int code);
	void delDistribution(1:int code);
	void delWriteoff(1:int code);
	
	void editEquipment(1:Equipment equipment);
	void editCabinet(1:Cabinet cabinet);
	void editResponsible(1:Responsible responsible);
	void editDistribution(1:Distribution distribution);
	void editWriteoff(1:Writeoff writeoff);
}























