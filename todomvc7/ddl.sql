CREATE TABLE TODO (
	id INT(5) unsigned NOT NULL AUTO_INCREMENT,
	title VARCHAR(255),
	description VARCHAR(255),
	due_date DATE,
	is_completed BOOLEAN DEFAULT false,
	PRIMARY KEY (`id`)
);

INSERT INTO TODO (title, description, due_date) VALUES ('�����ϱ�', '����, ���� ������ �Ѵ�', '2022-04-05');
INSERT INTO TODO (title, description, due_date) VALUES ('�����ϱ�', '�������� 1�ð� ���� ������ �Ѵ�.', '2022-05-07');
INSERT INTO TODO (title, description, due_date) VALUES ('�����ϱ�', '������ ��Ƽ� ��Ź�⸦ ������.', '2022-04-04');
INSERT INTO TODO (title, description, due_date) VALUES ('�ǾƳ�ġ��', '�п����� �ǾƳ븦 �����Ѵ�.', '2022-04-09');
INSERT INTO TODO (title, description, due_date) VALUES ('������ ���ֱ�', '���������� ��Ḧ �ش�.', '2022-04-07');
commit;